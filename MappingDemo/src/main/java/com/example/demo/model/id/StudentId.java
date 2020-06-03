package com.example.demo.model.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;
@Embeddable
public class StudentId implements Serializable {
private String id;
private String branchId;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getBranchId() {
	return branchId;
}
public void setBranchId(String branchId) {
	this.branchId = branchId;
}
}
