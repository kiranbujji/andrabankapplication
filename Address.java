package com.crud.andrabank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
private String lane1;
private String lane2;
private String lane3;
private String district;
private String state;
private String pincode;
private String landmark;
public Address() {
	super();
	
}
}