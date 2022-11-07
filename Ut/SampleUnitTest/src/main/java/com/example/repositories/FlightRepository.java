package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{
	public List<Flight> findFlightByFlightSourceAndDestination(String flightSource, String destination);

	//public List<Flight> findAllBySourceAndDestination(String flightSource, String flightDestination);

}
