package com.fintech.riskmanagementservic.helper;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fintech.riskmanagementservic.model.Company;

@Component
public class CompanyInfoConverter {
	public Company getCompanyInfoFromJson(String jsonResponse) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonResponse, Company.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
