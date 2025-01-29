package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import io.micrometer.common.util.StringUtils;

public class RegisterNumberRule implements RiskRule{

	
	@Override
	public int calculate(Company company) {
		String RegNum = company.getRegistrationNumber();
		if(StringUtils.isEmpty(RegNum)) {
			return RuleMatrix.HIGH.getScore();
		} else {
			return RuleMatrix.LOW.getScore();
		}
	}

}
