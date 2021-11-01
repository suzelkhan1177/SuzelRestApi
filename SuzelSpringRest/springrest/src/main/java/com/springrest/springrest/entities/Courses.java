package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	private long id;
	private String name;
	private String emailId;
	private long contact;
	private String message;
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}



	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", emailId=" + emailId + ", contact=" + contact
				+ ", message=" +message + "]";
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Courses() {
		super();
		
	}

	public Courses(long id, String name, String emailId, long contact, String description) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.contact = contact;
		this.message = description;
	}

	 
}
