package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;


public class ResignedDirectorsRule implements RiskRule{

	@Override
	public int calculate(Company company) {
		if (company.getRegistredDirectors() <= 10) {
			return RuleMatrix.LOW.getScore();
		} else if (company.getRegistredDirectors() <= 60) {
			return RuleMatrix.MEDIUM.getScore();
		} else {
			return RuleMatrix.HIGH.getScore();
		}
	}

}
