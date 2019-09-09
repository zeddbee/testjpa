package com.example.demo.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.repo.AgingColorRepository;

@Service
public class AgingColorService extends AbstractService<AgingColor, Long> {

	private AgingColorRepository agingColorRepository;

	public AgingColorService(AgingColorRepository agingColorRepository) {
		super(agingColorRepository);
		this.agingColorRepository = agingColorRepository;
	}
	
	  public List<AgingColor> findByAgeColorName(String ageColorName) {
	        return agingColorRepository.findByAgeColorName(ageColorName);
	    }
	
}
