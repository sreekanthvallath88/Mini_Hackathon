package com.fintech.riskmanagementservic.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fintech.riskmanagementservic.exception.ValidationException;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskManagement;

@Service
public class RiskManagementImpl implements RiskManagement{

	private final RiskReportRegister riskReportRegister = new RiskReportRegister();

	 @Value("${auth.url}")
	 private String url;

	 @Value("${auth.host}")
	 private String host;
	 
	 @Value("${auth.token}")
	 private String token;

	@Override
	public int riskCalculation(Company company) {
		return riskReportRegister.getRules().stream().
				mapToInt(rule -> rule.calculate(company)).sum();
	}

	@Override
	public String riskLevel(int score) {
		if(score >=80) {
			return "Low Risk";
		} else if (score >=50) {
			return "Medium Risk";
		} else {
			return "High Risk";
		}
	}

	@Override
	public String getCompanyApi(String companyNumber) {
		final String uri = url.concat(companyNumber);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.set(HttpHeaders.HOST, host);
        header.set(HttpHeaders.AUTHORIZATION, token);
        
        HttpEntity<String> requestEntity = new HttpEntity<String>("body", header);
        ResponseEntity<String> responseEntity =  restTemplate.exchange(uri, HttpMethod.GET, requestEntity, String.class);
        
        String response = responseEntity.getBody();
        System.out.println();
        return response;
	}
	
	@Override
    public void validation(Company company) {
		/*
		 * Check if company name is empty
		 */        
		if (company.getCompanyName() == null || company.getCompanyName().isEmpty()) {
            throw new ValidationException("Company name is required.");
        }
		
		/*
		 * Check if incorporation is valid
		 */ 
        if (company.getIndustrySector() == null) {
            throw new ValidationException("IndustrySector is required.");
        }
    }

}
