package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;

public class CompanyTypeRule implements RiskRule {

	@Override
	public int calculate(Company company) {
		String companyType = company.getCompanyType();
		if (StringUtil.notNullNorEmpty(companyType)) {
			if ("Sole-trader".contains(companyType)) {
				return RuleMatrix.HIGH.getScore();
			} else {
				return RuleMatrix.LOW.getScore();
			}
		}
		return RuleMatrix.LOW.getScore();

	}

}
