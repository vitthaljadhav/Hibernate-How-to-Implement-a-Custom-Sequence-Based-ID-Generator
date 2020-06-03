package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;
import com.example.demo.model.id.AddressId;
@Repository
public interface AddressRepos extends JpaRepository<Address, AddressId> {

}
