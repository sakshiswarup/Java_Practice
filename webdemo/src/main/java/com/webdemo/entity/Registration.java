package com.webdemo.entity;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
//change to javax because of version here java 8
import javax.persistence.*;
@Entity
@Table(name="registrations")
public class Registration {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
	
	@Column(name="name", nullable= false, length=20)
	private String name;
	
	@Column(name="email_id", nullable=false, length=125, unique=true)
	private String emailId;
	
	@Column(name="mobile", nullable=false, length=10)
	private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
