package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Flight;
import com.example.services.FlightService;


@RestController
@RequestMapping("/flights")
@CrossOrigin("*")
public class FlightController {
	
	@Autowired
	private FlightService flightService;

	//For adding flight data
	@PostMapping("/")
	public ResponseEntity<String> AddFlight(@RequestBody Flight flight) {
		flightService.AddFlight(flight);
		return new ResponseEntity<String>("FLIGHT ADDED SUCCESSFULLY", HttpStatus.CREATED);
	}

	//For displaying all the flight data
	@GetMapping("/getAllFlight")
	public ResponseEntity<List<Flight>> getFlightData() {
		return new ResponseEntity<List<Flight>>(flightService.getFlightData(), HttpStatus.OK);
	}


	// For Deleting Flight by Flight Id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable int id) {
		Flight index = flightService.getFlightById(id);
		flightService.removeFlight(index);
		return new ResponseEntity<String>("DELETED SUCCESSFULLY", HttpStatus.CREATED);
	}

	// For Updating Flight According to Flight Id
		@PutMapping("/updateFlight/{id}")
		public ResponseEntity<?> UpdateFlight(@PathVariable int id, @RequestBody Flight flight) {
//			flightService.UpdateFlight(flight, id);	
			return new ResponseEntity<>(flightService.UpdateFlight(id,flight), HttpStatus.OK);

		}


	

}
