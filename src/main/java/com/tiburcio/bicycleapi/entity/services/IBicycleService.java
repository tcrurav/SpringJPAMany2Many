package com.tiburcio.bicycleapi.entity.services;

import java.util.List;

import com.tiburcio.bicycleapi.entity.models.Bicycle;

public interface IBicycleService {
	public List<Bicycle> getAllBicycles();
	public void addBicycle(Bicycle bicycle);
	public List<Bicycle> getAllBicyclesInShop(String cif);
}
