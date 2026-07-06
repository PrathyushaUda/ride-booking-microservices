package com.springframework.DriverService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springframework.DriverService.model.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {

}
