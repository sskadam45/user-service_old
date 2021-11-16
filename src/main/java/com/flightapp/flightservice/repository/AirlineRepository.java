package com.flightapp.flightservice.repository;

import com.flightapp.flightservice.model.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline,Long> {
}
