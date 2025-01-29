package com.fintech.riskmanagementservic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fintech.riskmanagementservic.helper.CompanyInfoConverter;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.response.CreditScoreResponse;
import com.fintech.riskmanagementservic.service.RiskManagement;

@RestController
@RequestMapping("api/credit")
public class RiskManagementController {
	
	@Autowired
	RiskManagement riskManagement;
	
	@Autowired
	CompanyInfoConverter companyInfoConverter;
	
	@PostMapping("/calculate")
	public CreditScoreResponse calculateCreditScore(@RequestBody Company company) throws JsonMappingException, JsonProcessingException {
		riskManagement.validation(company);
        int score = riskManagement.riskCalculation(company);
        String riskLevel = riskManagement.riskLevel(score);
        return new CreditScoreResponse(score, riskLevel);
	}

	@GetMapping("/checkRisk")
	public String getRisk(int score) {
		return riskManagement.riskLevel(score);
	}
	
	@PostMapping("calculate/live/{companyNumber}")
	public CreditScoreResponse calculateCreditScoreUsingCompanyNumber(@PathVariable("companyNumber") String companyNumber) {
		String response = riskManagement.getCompanyApi(companyNumber);
		Company company = companyInfoConverter.getCompanyInfoFromJson(response);
		int score = riskManagement.riskCalculation(company);
		String riskLevel = riskManagement.riskLevel(score);
		return new CreditScoreResponse(score, riskLevel);
	}
	
	
	
}
