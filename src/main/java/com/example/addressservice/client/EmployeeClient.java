package com.example.addressservice.client;

import com.example.addressservice.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "EMPLOYEE-SERVICE",configuration = FeignConfig.class)

public interface EmployeeClient {

    @GetMapping("/employees/{id}")
    Map<String, Object> getEmployeeById(@PathVariable Integer id);

}
