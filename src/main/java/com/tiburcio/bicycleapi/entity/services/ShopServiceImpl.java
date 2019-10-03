package com.tiburcio.bicycleapi.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.bicycleapi.entity.dao.IShopDao;
import com.tiburcio.bicycleapi.entity.models.Shop;

@Service
public class ShopServiceImpl implements IShopService {

	@Autowired
	private IShopDao shopDao;
	
	@Override
	public List<Shop> getAllShops() {
		return (List<Shop>) shopDao.findAll();
	}

}
