package com.nt.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class MakeMyTripFlight {

	@GetMapping("/whoareyou")
	public ResponseEntity<String> getMyName(){
		
		return new ResponseEntity<String>("Flight Service of MMT's",HttpStatus.OK);
	}
	
	@GetMapping("/bookflight/{name}/{amt}")
	public ResponseEntity<String> bookFlight(@PathVariable("name")String name,@PathVariable("amt") Integer amt){
		
		Map<String, Object> map = Map.of("Name: ",name,"Amount: ",amt);
		
		return new ResponseEntity<String>("Booking Success!!, Please colect youur below ticket booked.\n"+map,HttpStatus.OK);
	}
	
	
}
