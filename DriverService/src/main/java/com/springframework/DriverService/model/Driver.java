package com.springframework.DriverService.model;

import com.springframework.DriverService.controller.DriverController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "drivers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long driverId;

	private String driverName;

	private String mobileNumber;

	private String vehicleNumber;
	private String vehicleType;
	

	private Boolean availabilityStatus;
}
