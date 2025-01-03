package com.yrgo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
	The call class represents a single call made by a customer.
	For example: Jim called from HB at 10.30 15 November 2019.
 */
@Entity
@Table(name="TBL_CALL")
public class Call {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private Date timeAndDate;

	private String notes;

	public Call(String notes){
		// this defaults to a timestamp of "now"
		this (notes, new java.util.Date());
	}

	public Call(String notes, Date timestamp){
		// this defaults to a timestamp of "now"
		this.timeAndDate = timestamp;
		this.notes = notes;
	}

	public String toString()	{
		return this.timeAndDate + " : " + this.notes;
	}

	public Date getTimeAndDate() {
		return timeAndDate;
	}

	public void setTimeAndDate(Date timeAndDate) {
		this.timeAndDate = timeAndDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Call() {}
}
