package com.example.addressservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "employee-service", url = "http://localhost:8085")

public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    Map<String,Object> getEmployeeById(@PathVariable Integer id);
}
