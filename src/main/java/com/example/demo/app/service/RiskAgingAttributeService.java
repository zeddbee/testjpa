package com.example.demo.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.domainName.entity.AgingStartDate;
import com.example.demo.app.dto.RiskAgingAttribute;

@Service
public class RiskAgingAttributeService {

	@Autowired
	private AgingColorService agingColorServcie;
	@Autowired
	private AgingStartDateService agingStartDateServcie;

	public RiskAgingAttribute getAllRiskAgingAttribute() {

		RiskAgingAttribute riskAgingAttribute = new RiskAgingAttribute();
		List<AgingColor> listOfAgingColor = new ArrayList<>();
		listOfAgingColor = agingColorServcie.findAll();
		List<AgingStartDate> listOfAgingStartDate = new ArrayList<>();
		listOfAgingStartDate = agingStartDateServcie.findAll();
		riskAgingAttribute.setAgingColor(listOfAgingColor);
		riskAgingAttribute.setAgingStartDate(listOfAgingStartDate);
		System.out.println(riskAgingAttribute);
		return riskAgingAttribute;

	}

	public RiskAgingAttribute saveRiskAgingAttribute(RiskAgingAttribute riskAgingAttribute) {
		AgingColor agingColor = riskAgingAttribute.getAgingColor().get(0);
		AgingStartDate agingStartDate = riskAgingAttribute.getAgingStartDate().get(0);
		agingColor = agingColorServcie.save(agingColor);
		agingStartDate = agingStartDateServcie.save(agingStartDate);
		riskAgingAttribute = new RiskAgingAttribute();
		List<AgingColor> listOfAgingColor = new ArrayList<>();
		List<AgingStartDate> listOfAgingStartDate = new ArrayList<>();
		listOfAgingColor.add(agingColor);
		listOfAgingStartDate.add(agingStartDate);
		riskAgingAttribute.setAgingColor(listOfAgingColor);
		riskAgingAttribute.setAgingStartDate(listOfAgingStartDate);
		return riskAgingAttribute;

	}

	public AgingColor saveAgingColor(AgingColor agingColor) {
		return agingColorServcie.save(agingColor);
	}

	public AgingStartDate aveAgingStartDate(AgingStartDate agingStartDate) {

		return agingStartDateServcie.save(agingStartDate);

	}

	public List<AgingColor> getAllAgingColor() {

		return agingColorServcie.findAll();
	}

	public List<AgingStartDate> getAllAgingStartDate() {

		return agingStartDateServcie.findAll();
	}

}
