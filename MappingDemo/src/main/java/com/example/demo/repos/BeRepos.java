package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BE;

public interface BeRepos extends JpaRepository<BE, String> {

}
