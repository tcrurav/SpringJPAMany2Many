package com.tiburcio.bicycleapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.bicycleapi.entity.models.Shop;
import com.tiburcio.bicycleapi.entity.services.IShopService;

@RestController
public class ShopController {
	
	@Autowired
	private IShopService shopService;
	
	@GetMapping("/api/shops")
	public List<Shop> getAllShops(){
		return shopService.getAllShops();
	}
}
