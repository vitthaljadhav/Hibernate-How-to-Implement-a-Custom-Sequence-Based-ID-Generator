package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.example.demo.seq.StringPrefixedSequenceGenerator;

@Entity
public class BE {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "be_seq")
	@GenericGenerator(name = "be_seq",
	strategy = "com.example.demo.seq.StringPrefixedSequenceGenerator",
	parameters = {
			//@Parameter(name= StringPrefixedSequenceGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=StringPrefixedSequenceGenerator.VALUE_PREFIX_PARAMETER, value ="VJ"),
			@Parameter(name=StringPrefixedSequenceGenerator.NUMBER_FORMAT_PARAMETER,value = "%05d")
	})
	
	@Column(name = "ID")
	private String id;

	@Column(name = "COLLAGE_NAME")
	private String collageName;
	@Column(name = "F_NAME")
	private String fname;
	@Column(name = "L_NAME")
	private String lname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
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
