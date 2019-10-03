package com.tiburcio.bicycleapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.bicycleapi.entity.models.Bicycle;
import com.tiburcio.bicycleapi.entity.services.IBicycleService;

@RestController
public class BicycleController {
	
	@Autowired
	private IBicycleService bicycleService;
	
	@GetMapping("/api/bicycles")
	private List<Bicycle> getBicycles(){
		return bicycleService.getAllBicycles();
	}
	
	@GetMapping("/api/bicycles/shop/{cif}")
	private List<Bicycle> getBicyclesInShop(@PathVariable(value = "cif") String cif){
		return bicycleService.getAllBicyclesInShop(cif);
	}
		
	@PostMapping("/api/bicycle")
	private void addBicycle(Bicycle bicycle) {
		bicycleService.addBicycle(bicycle);
	}

}
