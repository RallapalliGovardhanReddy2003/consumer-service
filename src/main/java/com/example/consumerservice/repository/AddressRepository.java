package com.example.consumerservice.repository;
import com.example.consumerservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {


    List<Address> findByEmployeeId(Integer employeeId);
}

