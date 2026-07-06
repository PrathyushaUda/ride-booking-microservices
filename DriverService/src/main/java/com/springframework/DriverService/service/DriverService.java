package com.springframework.DriverService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.DriverService.Repository.DriverRepo;
import com.springframework.DriverService.model.Driver;

@Service
public class DriverService{
	@Autowired
	DriverRepo driverRepository;


    public Driver saveDriver(Driver driver) {

        return driverRepository.save(driver);
    }

  

    public Driver getDriverById(Long driverId) {

        return driverRepository.findById(driverId)
                .orElse(null);
    }


    public List<Driver> getAllDrivers() {

        return driverRepository.findAll();
    }

}
