package com.tiburcio.bicycleapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.bicycleapi.entity.models.Bicycle;

public interface IBicycleDao extends CrudRepository<Bicycle, Long> {
	
//	@Query("SELECT u.tags FROM User u WHERE u.id = :id")
//	public Set<UserTag> getUserTagsByUserId(@Param("id") int id);
	
	
}
