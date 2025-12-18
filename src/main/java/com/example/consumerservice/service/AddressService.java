package com.example.consumerservice.service;
import com.example.consumerservice.entity.Address;
import com.example.consumerservice.repository.AddressRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository repo;


    private static final Logger logger = LoggerFactory.getLogger(AddressService.class);
    public AddressService(AddressRepository repo) {
        this.repo = repo;
    }

    public Address save(Address address) {
        logger.info("Saving address: {}", address);
        return repo.save(address);
    }

    public List<Address> getAll() {
        logger.info("Retrieving all addresses");
        return repo.findAll();
    }

    public Address getById(Integer id) {
        logger.info("Retrieving address with id: {}", id);
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Address not found"));
    }

    public Address update(Integer id, Address adsress) {
        logger.info("Updating address with id: {}", id);
        Address existing = getById(id);
        existing.setAddress(adsress.getAddress());
        logger.info("Updated address: {}", existing);
        return repo.save(existing);
    }

    public void delete(Integer id) {
        logger.info("Deleting address with id: {}", id);
        repo.deleteById(id);
    }
    public List<Address> getAllAddresses() {
        logger.info("Retrieving all addresses");
        return repo.findAll();
    }
    public List<Address> getAddressesByEmployeeId(Integer employeeId) {
        logger.info("Retrieving addresses for employeeId: {}", employeeId);
        return repo.findByEmployeeId(employeeId);
    }

}

