package com.apidemo.controller;
import com.apidemo.entity.Registration;
import com.apidemo.payload.RegistrationDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.apidemo.service.RegistrationService;

@RestController
@RequestMapping("/api/v1/register")
public class RegistrationController {

    private RegistrationService registrationService;
    //alt+enter for creating constructor
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    @PostMapping
    public ResponseEntity<?> createRegistration(
            //http://localhost:8080/api/v1/register
           @Valid @RequestBody RegistrationDto registrationDto,
            BindingResult result
    ) {
        if(result.hasErrors()){
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        RegistrationDto registration = registrationService.createRegistration(registrationDto);
        //  return "Registration successful with ID: " + registration.getId();
        return  ResponseEntity.status(HttpStatus.CREATED).header("Custom-Header","Value")
                .body(registration);
    }

    //http://localhost:8080/api/v1/register?id=1
    @DeleteMapping
    public ResponseEntity<String> deleteRegistration(
            @RequestParam long id
    ) {
        registrationService.deleteRegistration(id);
        return new ResponseEntity<>("Registration successfully deleted with ID: " + id, HttpStatus.OK);
    }

    //http://localhost:8080/api/v1/register/2
    @PutMapping("{id}")
    public String updateRegistration(
            @PathVariable long id,
            @RequestBody RegistrationDto registrationDto
    ) {
        registrationService.updateRegistration(id, registrationDto);
        return "Registration updated successfully with ID:" + id;
    }

    //for all records
    //http://localhost:8080/api/v1/register
    //http://localhost:8080/api/v1/register?pageNo0&pageSize=3
   // http://localhost:8080/api/v1/register?pageNo0&pageSize=3&sortBy=title //title ex like name, mobiler5
    //http://localhost:8080/api/v1/register?pageNo0&pageSize=5&sortBy=name&sortDir=asc
    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAllRegisrtration(

          @RequestParam(name="pageNo",required = false,defaultValue = "0")  int pageNo,
          @RequestParam(name="pageSize",required = false,defaultValue = "3")  int pageSize,
          @RequestParam(name="sortBy",required = false,defaultValue = "id") String sortBy,
          @RequestParam(name="sortDir",required = false,defaultValue="asc") String sortDir
    ) {
        List<RegistrationDto> registrations = registrationService.getAllRegisrtration(pageNo,pageSize,sortBy,sortDir);
        return new ResponseEntity<> (registrations,HttpStatus.OK);
    }

    @GetMapping("/byId")
    public ResponseEntity<Registration> getRegistration(
            @RequestParam long id){
        Registration reg = registrationService.getRegistrationById(id);
        return  new ResponseEntity<>(reg,HttpStatus.OK);
    }
}
