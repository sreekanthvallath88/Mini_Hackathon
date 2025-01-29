package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;


public class StatementOfCapitalRule implements RiskRule{

	@Override
	public int calculate(Company company) {
		if (company.getStatementOfCapital() >= 10000) {
			return RuleMatrix.LOW.getScore();
		} else if (company.getStatementOfCapital() >= 1001) {
			return RuleMatrix.MEDIUM.getScore();
		} else {
			return RuleMatrix.HIGH.getScore();
		}
	}
}
