package com.templeapps.temple.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.templeapps.temple.model.Priest;

@Repository
public interface PriestRepository extends CrudRepository<Priest, Long>{

	Priest save(Priest priest);
	Priest findById(int id);
	

  
}
