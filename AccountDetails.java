package com.crud.andrabank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AccountDetails {
	private long id;
private String accountname;
private String accountno;
private String accountbal;
private String phoneno;
private String ifsccode;
private Address address;
public String getAccountname() {
	return accountname;
}
public void setAccountname(String accountname) {
	this.accountname = accountname;
}
public String getAccountno() {
	return accountno;
}
public void setAccountno(String accountno) {
	this.accountno = accountno;
}
public String getAccountbal() {
	return accountbal;
}
public void setAccountbal(String accountbal) {
	this.accountbal = accountbal;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getIfsccode() {
	return ifsccode;
}
public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public long getId1() {
	return id;
}
public void setId(long id) {
	id = id;
}
public AccountDetails(String accountname, String accountno, String accountbal, String phoneno, String ifsccode,
		Address address) {
	super();
	id = id;
	this.accountname = accountname;
	this.accountno = accountno;
	this.accountbal = accountbal;
	this.phoneno = phoneno;
	this.ifsccode = ifsccode;
	this.address = address;
}

	
}



