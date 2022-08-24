package com.example.load.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.load.model.Loads;
import com.example.load.services.LoadsService;

@RestController
public class LoadsController {
	@Autowired
	private LoadsService loadsService;
	
	@GetMapping("/home")
     public String home()
     {
    	 return "this is home page";
     }
	@GetMapping("/loads")
	public List<Loads> getLoads()
	{
		return this.loadsService.getLoads();
	}
	
	@GetMapping("/loads/{loadsId}")
	public Optional<Loads> getLoad(@PathVariable long loadsId)
	{
		return this.loadsService.getLoad(loadsId);
	}
	@GetMapping("/shipperData/{shipperId}")
	public List<Loads> getShipperData(@PathVariable Iterable<Long> shipperId )
	{
		return this.loadsService.getShipperData(shipperId);
	}
	
	@PostMapping("/loads")
	public Loads addLoad(@RequestBody Loads load)
	{
		return this.loadsService.addLoad(load);
	}
	
	@PutMapping("/loads")
	public Loads updateLoad(@RequestBody Loads load)
	{
		return this.loadsService.updateLoad(load);
	}
	
	@DeleteMapping("/loads/{loadsId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable long loadsId)
	{
		try {
			 this.loadsService.deleteLoad(loadsId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
