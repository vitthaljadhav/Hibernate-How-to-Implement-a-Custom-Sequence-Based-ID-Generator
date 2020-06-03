package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import com.example.demo.model.id.StudentId;
@Repository
public interface StudentRepos extends JpaRepository<Student, StudentId>{

}
