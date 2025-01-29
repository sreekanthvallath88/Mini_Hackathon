package com.fintech.riskmanagementservic.service;

import com.fintech.riskmanagementservic.model.Company;


public interface RiskManagement {
	void validation(Company clmpany);
	int riskCalculation(Company clmpany);
	String riskLevel(int score);
	String getCompanyApi(String companyNumber);

}
