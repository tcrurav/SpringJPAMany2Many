package com.tiburcio.bicycleapi.entity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tiburcio.bicycleapi.entity.models.Bicycle;
import com.tiburcio.bicycleapi.entity.models.Shop;

public interface IShopDao extends CrudRepository<Shop, String>  {

	@Query("SELECT s.bicyclesInShop FROM Shop s WHERE s.cif = :cif")
	public List<Bicycle> findAllBicyclesByShopCif(@Param("cif") String cif);
}
