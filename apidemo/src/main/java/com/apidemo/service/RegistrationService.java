package com.apidemo.service;
import com.apidemo.entity.Registration;
import com.apidemo.exception.ResourceNotFound;
import com.apidemo.payload.RegistrationDto;
import com.apidemo.repository.RegistrationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistrationService {
    private  RegistrationRepository registrationRepository;

    private ModelMapper modelMapper;


    public RegistrationService(RegistrationRepository registrationRepository, ModelMapper modelMapper) {
        this.registrationRepository = registrationRepository;
        this.modelMapper = modelMapper;
    }
    public RegistrationDto createRegistration(
            RegistrationDto registrationDto
    ){
        Registration registration = convertToEntity(registrationDto);
        Registration savedRegistration = registrationRepository.save(registration);
        return convertToDto(savedRegistration);
    }

    Registration convertToEntity(RegistrationDto registrationDto){
        Registration reg = modelMapper.map(registrationDto, Registration.class);
//   Registration registration = new Registration();
//   registration.setName(registrationDto.getName());
//   registration.setEmailId(registrationDto.getEmailId());
//   registration.setMobile(registrationDto.getMobile());
//   return registration;
        return reg;
    }
    RegistrationDto convertToDto(Registration registration){
        RegistrationDto dto = modelMapper.map(registration, RegistrationDto.class);
//        RegistrationDto registrationDto = new RegistrationDto();
//        registrationDto.setId(registration.getId());
//        registrationDto.setName(registration.getName());
//        registrationDto.setEmailId(registration.getEmailId());
//        registrationDto.setMobile(registration.getMobile());
//        return registrationDto;
        return dto;
    }

    public void deleteRegistration(long id) {
        registrationRepository.deleteById(id);
    }

    public void updateRegistration(long id, RegistrationDto registrationDto) {
        Optional<Registration> opReg = registrationRepository.findById(id);
        if(opReg.isPresent()) {
            Registration reg = opReg.get();
            reg.setName(registrationDto.getName());
            reg.setEmailId(registrationDto.getEmailId());
            reg.setMobile(registrationDto.getMobile());
            registrationRepository.save(reg);
        }
    }

    public List<RegistrationDto> getAllRegisrtration(
            int pageNo, int pageSize,
            String sortBy, String sortDir) {
        Sort sort = sortDir.equals("asc") ? Sort.by(Sort.Order.asc(sortBy)): Sort.by(Sort.Order.desc(sortBy));

        PageRequest page = PageRequest.of(pageNo, pageSize, sort);
        Page<Registration> all = registrationRepository.findAll(page);
        List<Registration> registrations = all.getContent();

        System.out.println(page.getPageNumber());
        System.out.println(page.getPageSize());
        System.out.println(all.getTotalPages());
        System.out.println(all.isLast());
        System.out.println(all.isFirst());


        // List<Registration> registrations = registrationRepository.findAll();
        return  registrations.stream().map((element) -> modelMapper.map(element, RegistrationDto.class)).collect(Collectors.toList());
        // return registrations;
    }

    public Registration getRegistrationById(long id){
        Registration reg = registrationRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFound("Could not found")
        );
        return reg;
    }
}
