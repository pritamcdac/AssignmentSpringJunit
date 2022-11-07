package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Flight;
import com.example.repositories.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public void AddFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
	}

	
	public List<Flight> getFlightData() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}


	public void deleteFlightById(int id) {
		// TODO Auto-generated method stub
	 	flightRepository.findById(id);
	}


	public Flight getFlightById(int id) {
		// TODO Auto-generated method stub
		return flightRepository.getById(id);
	}


	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.delete(flight);
		System.out.println("USER DELETED SUCCESSFULLY FROM DATABASE");
	}
	

//	public void UpdateFlight(Flight flight) {
//		flightRepository.save(flight);
//	}
	
	public Flight UpdateFlight(int id,Flight flight) {
		Flight updateFlight= flightRepository.findById(id).get();
		updateFlight.setDestination(flight.getDestination());
		updateFlight.setFlightSource(flight.getFlightSource());
		return flightRepository.save(updateFlight);
	}
	


}
