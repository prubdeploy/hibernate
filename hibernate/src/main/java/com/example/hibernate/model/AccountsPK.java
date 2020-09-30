package com.example.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class AccountsPK implements Serializable {
	@Column(name="account_id")
	String accID; 
	@Column(name="account_type")
	String accType;
	public AccountsPK()
	{
		
	}
	public AccountsPK (String accID, String accType){
		this.accID=accID;
		this.accType=accType;
	}
	
	
	public String getAccID() {
		return accID;
	}
	public void setAccID(String accID) {
		this.accID = accID;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}

}
