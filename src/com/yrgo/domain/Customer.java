package com.yrgo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
	The customer class represents a single customer and it has all the details
	such as the company name, the customer’s telephone number, email address and so on.
 */
@Entity
public class Customer {

	@Id
	private String customerId;

	private String companyName;

	private String email;

	private String telephone;

	private String notes;

	@OneToMany(cascade=CascadeType.ALL)	// One customer can have many calls.
	private List<Call> calls; // Here: I guess you store each call (?)

	/*
		Constructor to create a customer.
	 */
	public Customer(String customerId, String companyName, String email,
			             String telephone, String notes) {
		this(customerId, companyName, notes);
		this.email = email;
		this.telephone = telephone;
	}

	/*
		What is the diffrence with this constructor?
	 */
	public Customer(String customerId, String companyName, String notes){
		this.customerId = customerId;
		this.companyName = companyName;
		this.notes = notes;
		this.calls = new ArrayList<Call>();
	}

	// Method to add call to the Call-array "calls"
	public void addCall(Call callDetails) {
		this.calls.add(callDetails);
	}


	public String toString(){
		return this.customerId + ": " + this.companyName ;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getNotes() {
		return notes;
	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}

	// needed for JPA - ignore until then
	public Customer() {}
}

