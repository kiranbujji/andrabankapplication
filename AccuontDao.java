/**
 * 
 */
package com.crud.andrabank.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MY PC
 *
 */


//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="AccountDetails")
public class AccuontDao {
	@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="account_name")
	private String accountname;
	
	@Column(name="account_No")
	private String accountno;
	
	@Column(name="account_Balance")
	private String accountbal;
	
	@Column(name="phone_No")
	private String phoneno;
	
	@Column(name="account_IFSC")
	private String ifsccode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public AccuontDao() {
		super();
		this.id = id;
		this.accountname = accountname;
		this.accountno = accountno;
		this.accountbal = accountbal;
		this.phoneno = phoneno;
		this.ifsccode = ifsccode;
	}


}
