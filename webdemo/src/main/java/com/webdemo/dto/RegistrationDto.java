package com.webdemo.dto;
//Dto = data transfer object
//it is class only to create read data and here object of data cannot go to database only entity class to go to database
public class RegistrationDto {
private String name;
private String emailId;
private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

}
