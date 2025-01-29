package com.fintech.riskmanagementservic.service;

import com.fintech.riskmanagementservic.model.Company;


public interface RiskRule {
	int calculate(Company company);
}
