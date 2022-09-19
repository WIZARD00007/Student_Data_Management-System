package com.akshay.webApp;

import java.util.Random;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Students{



@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="demo_sql")
@GenericGenerator(name="demo_sql",strategy="com.akshay.webApp.Idgenerator",parameters= {
		@Parameter(name=Idgenerator.INCREMENT_PARAM,value="1"),
		@Parameter(name=Idgenerator.VALUE_PREFIX_PARAMETER,value="UID"),
		@Parameter(name=Idgenerator.NUMBER_FORMAT_PARAMETER,value="%05d")
})
@Id
private String id;

	private String middleName;
	private String firstName;
	private String lastName;
    private String gender;
	private String phone;
	private String address;
	private String psw;
	private String psw_repeat;
	private String email;
	private String status;
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getPsw_repeat() {
		return psw_repeat;
	}

	public void setPsw_repeat(String psw_repeat) {
		this.psw_repeat = psw_repeat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}}