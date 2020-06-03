package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Address;
import com.example.demo.model.BE;
import com.example.demo.model.Student;
import com.example.demo.model.id.AddressId;
import com.example.demo.model.id.StudentId;
import com.example.demo.repos.AddressRepos;
import com.example.demo.repos.BeRepos;
import com.example.demo.repos.StudentRepos;

@SpringBootApplication
public class MappingDemoApplication implements ApplicationRunner {

	@Autowired
	private StudentRepos studentRepos;
	@Autowired
	private AddressRepos addressRepos;
	@Autowired
	private BeRepos beRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * Address address = getAddress(); Student student = getStudent(); Address a1 =
		 * new Address(); //a1.setId(address.getId()); // student.setAddress(address);
		 * student.getAddress().add(address); address.setStudent(student);
		 * studentRepos.save(student); addressRepos.save(address);
		 * System.out.println("Inserted Successfully..");
		 * 
		 * 
		 * 
		 */
		
	
	
	BE be = new BE();
	be.setCollageName("JIT Collage of Engineering Nashik");
	be.setFname("Vitthal");
	be.setLname("Jadhav");
	beRepos.save(be);
	System.out.println("Inserted Successfully");
	}

	public Address getAddress() {
		Address address = new Address();
		AddressId id=new AddressId();
		address.setCity("Pune");
		address.setState("MH");
		id.setId("A100");
		id.setAddressId("Ad0001");
		address.setId(id);
		return address;
	}

	public Student getStudent() {
		Student student = new Student();
		StudentId id = new StudentId();
		student.setFname("Vitthal");
		student.setLname("Jadhav");
		id.setId("stud001");
		id.setBranchId("stud001");
		student.setId(id);
		return student;
	}
}
