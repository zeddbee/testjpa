package com.example.demo.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.domainName.entity.AgingColor;
import com.example.demo.app.domainName.entity.AgingStartDate;
import com.example.demo.app.dto.RiskAgingAttribute;
import com.example.demo.app.request.RiskAgingAttributeRequest;
import com.example.demo.app.response.RiskAgingAttributeResponse;
import com.example.demo.app.service.RiskAgingAttributeService;



@RestController
@RequestMapping("/admin")
public class ApplicationController {

	@Autowired
	private RiskAgingAttributeService riskAgingAttributeService;

	@RequestMapping(value = "/listAllRiskAgingAttribute", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<RiskAgingAttributeResponse> fetchAllRiskAgingAttribute(
			@RequestHeader HttpHeaders header) {
		RiskAgingAttributeResponse riskAgingAttributeResponse = new RiskAgingAttributeResponse();
		RiskAgingAttribute riskAgingAttribute = riskAgingAttributeService.getAllRiskAgingAttribute();

		riskAgingAttributeResponse.setAgingColor(riskAgingAttribute.getAgingColor());
		riskAgingAttributeResponse.setAgingStartDate(riskAgingAttribute.getAgingStartDate());
		riskAgingAttributeResponse.setResponseMessage("Fetched Succssfully");
		return new ResponseEntity<RiskAgingAttributeResponse>(riskAgingAttributeResponse, HttpStatus.OK);

	}

	@RequestMapping(value = "/saveRiskAgingAttribute", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody ResponseEntity<RiskAgingAttributeResponse> saveRiskAgingAttribute(
			@RequestHeader HttpHeaders header, @RequestBody RiskAgingAttributeRequest request) {
		RiskAgingAttributeResponse riskAgingAttributeResponse = new RiskAgingAttributeResponse();
		RiskAgingAttribute riskAgingAttribute = new RiskAgingAttribute();
		AgingColor agingColor = request.getAgingColor();
		List<AgingColor> listOfAgingColor = new ArrayList<>();
		listOfAgingColor.add(agingColor);

		AgingStartDate agingStartDate = request.getAgingStartDate();
		List<AgingStartDate> listOfAgingStartDate = new ArrayList<AgingStartDate>();
		listOfAgingStartDate.add(agingStartDate);

		riskAgingAttribute.setAgingColor(listOfAgingColor);
		riskAgingAttribute.setAgingStartDate(listOfAgingStartDate);

		riskAgingAttributeService.saveRiskAgingAttribute(riskAgingAttribute);
		riskAgingAttributeResponse.setResponseMessage("Saved Succssfully");
		return new ResponseEntity<RiskAgingAttributeResponse>(riskAgingAttributeResponse, HttpStatus.OK);

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ResponseEntity<String> testApplication() {
		String result = "Hello....";
		return new ResponseEntity<String>(result, HttpStatus.OK);

	}
}

