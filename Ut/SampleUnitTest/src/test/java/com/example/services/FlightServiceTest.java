package com.example.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.models.Flight;
import com.example.repositories.FlightRepository;





//tells Junit to run using Spring Testing support//Bridge bet Springboot and Junit
@RunWith(SpringRunner.class)
//tells springboot to look main cofiguration class with @SpringBootApplication Class start Application
@SpringBootTest
public class FlightServiceTest {
	
	@Autowired 
	private FlightService flightService;
	
	//creates mock objects and injects it into Application 
	@MockBean
	private FlightRepository flightRepository;
	
	@Test
	void testAddFlight() {
		Flight flight = new Flight(1,1233,"Airways", "Mumbai","Pune", "Economy","Morning","23-10-2022",200,3, 4000);
		Mockito.when(flightRepository.save(flight)).thenReturn(flight);
		assertThat(flight.getFlightId()==1);
		assertThat(flight!=null);
	}
	
	@Test
	void testGetAllFlights() {
		Flight flight1 =new Flight(1,1233,"Airways", "Mumbai","Pune", "Economy","Morning","23-10-2022",200,3, 4000);
		Flight flight2 = new Flight(2,5633,"AirGo","Kolkata","Delhi","Business","Afternoon","3-10-2022",200,4,5600);
		List<Flight> flightList=new ArrayList<>();
		flightList.add(flight1);
		flightList.add(flight2);
		
		Mockito.when(flightRepository.findAll()).thenReturn(flightList);
		assertThat(flightService.getFlightData()).isEqualTo(flightList);
	}
	
	
	@Test
	void testDeleteFlight() {
		Flight flight =new Flight(1,1233,"Airways", "Mumbai","Pune", "Economy","Morning","23-10-2022",200,3, 4000);
		assertThat(flight.getFlightId()>0);
		Mockito.when(flightRepository.getById((int)1)).thenReturn(flight);
	}
	
	@Test
	void testUpdateFlight() {
		Flight flight = new Flight(1,1233,"Airways", "Mumbai","Pune", "Economy","Morning","23-10-2022",200,3, 4000);
	assertThat(flight.getFlightId()>0);
	Mockito.when(flightRepository.getById((int)1)).thenReturn(flight);
	
	flight.setFlightSource("vxv");
	flight.setDestination("hfhh");
	Mockito.when(flightRepository.save(flight)).thenReturn(flight);
	
	}
	

}