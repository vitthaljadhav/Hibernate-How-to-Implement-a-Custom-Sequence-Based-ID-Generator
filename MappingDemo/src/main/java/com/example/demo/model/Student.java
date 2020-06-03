package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import com.example.demo.model.id.StudentId;

@Entity(name = "Stud")
public class Student {
	@Id
	private StudentId id;
	private String fname;
	private String lname;
	//@OneToOne(cascade = CascadeType.ALL, targetEntity = Address.class)
	//private Address address;
	
	/* 3rd created */
	//@OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class)
	// private List<Address> address=new ArrayList<>();

	    @OneToMany(cascade = CascadeType.ALL, targetEntity = Address.class,mappedBy="student")
		 private List<Address> address=new ArrayList<>();

	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public StudentId getId() {
		return id;
	}

	public void setId(StudentId id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
