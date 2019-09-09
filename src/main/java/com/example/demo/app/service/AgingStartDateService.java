package com.example.demo.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.app.domainName.entity.AgingStartDate;
import com.example.demo.app.repo.AgingStartDateRepository;

@Service
public class AgingStartDateService extends AbstractService<AgingStartDate, Long> {

	private AgingStartDateRepository agingStartDateRepository;

	public AgingStartDateService(AgingStartDateRepository agingStartDateRepository) {
		super(agingStartDateRepository);
		this.agingStartDateRepository = agingStartDateRepository;
	}

	
	public List<AgingStartDate> findByStartDateType(String startDateType) {
		return agingStartDateRepository.findByStartDateType(startDateType);
	}

}

