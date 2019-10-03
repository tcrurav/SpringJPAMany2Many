package com.tiburcio.bicycleapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.bicycleapi.entity.dao.IBicycleDao;
import com.tiburcio.bicycleapi.entity.dao.IShopDao;
import com.tiburcio.bicycleapi.entity.models.Bicycle;

@Service
public class BicycleServiceImpl implements IBicycleService {
	
	@Autowired
	private IBicycleDao bicycleDao;
	
	@Autowired
	private IShopDao shopDao;

	@Override
	public List<Bicycle> getAllBicycles() {
		return (List<Bicycle>) bicycleDao.findAll();
	}

	@Override
	public void addBicycle(Bicycle bicycle) {
		bicycleDao.save(bicycle);
	}

	@Override
	public List<Bicycle> getAllBicyclesInShop(String cif) {
		// TODO Auto-generated method stub
		return shopDao.findAllBicyclesByShopCif(cif);
	}
	
	
}
