package com.templeapps.temple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.templeapps.temple.model.Priest;
import com.templeapps.temple.repository.PriestRepository;

@Service
public class PriestService {
	
	@Autowired
	PriestRepository priestRepository;
	public Priest addPriestInfo(Priest priest) {
		int  age = priest.getAge();
		if(age>40)
			priest.setWorkassigned("Main Sainnathi");
		else 
			priest.setWorkassigned("side Sainnathi");
		System.out.println("service class");
		savePriest(priest);
			return priest;
	}
	
	public Priest findById(int id) {
		Priest priest = priestRepository.findById(id);
		return priest;
	}

	  public Priest savePriest(Priest priest) {
	        return priestRepository.save(priest);
	    }
	  
}

	  
