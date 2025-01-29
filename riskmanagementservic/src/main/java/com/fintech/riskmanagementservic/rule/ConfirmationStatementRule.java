package com.fintech.riskmanagementservic.rule;


import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;

public class ConfirmationStatementRule implements RiskRule{

	@Override
	public int calculate(Company company) {
		String status = company.getConfirmationStatment();
		if(StringUtil.notNullNorEmpty(status)) {
			if ("every year".equals(status)) {
	            return RuleMatrix.LOW.getScore();
	        } else if ("bi-annual".equals(status)) {
	            return RuleMatrix.MEDIUM.getScore();
	        }
		}
		return RuleMatrix.HIGH.getScore();
	}
}
