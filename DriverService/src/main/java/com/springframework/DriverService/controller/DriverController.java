package com.springframework.DriverService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.DriverService.model.Driver;
import com.springframework.DriverService.service.DriverService;

@RestController
@RequestMapping("/Api/v1/drivers")
public class DriverController {
	@Autowired
	DriverService driverService;
	
	@PostMapping("/")
	public Driver saveDriver(@RequestBody Driver driver){
		return driverService.saveDriver(driver);
	}
	@GetMapping("/driver/{id}")
	public Driver getDriverById(@PathVariable Long id ){
			return driverService.getDriverById(id);
		
	}
	@GetMapping("/")
	List<Driver> getAllDrivers(){
		return driverService.getAllDrivers();
	}
}
