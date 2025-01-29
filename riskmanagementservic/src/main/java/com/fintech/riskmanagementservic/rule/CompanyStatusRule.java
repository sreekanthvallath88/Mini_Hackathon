package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;

public class CompanyStatusRule implements RiskRule{

	
	@Override
	public int calculate(Company company) {
		String companyStatus = company.getCompanyStatus();
		if(StringUtil.notNullNorEmpty(companyStatus)) {
			if("Active".contains(companyStatus)) {
				return RuleMatrix.LOW.getScore();
			} else {
				return RuleMatrix.HIGH.getScore();
			}
		}
		return RuleMatrix.HIGH.getScore();
	}

}
