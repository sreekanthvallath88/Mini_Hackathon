package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;

public class NatureOfBusinessRule  implements RiskRule{

	@Override
    public int calculate(Company company) {
		if(StringUtil.notNullNorEmpty(company.getNatureOfBusiness())) {
			if (company.getNatureOfBusiness().equals("9999")) {
	            return RuleMatrix.HIGH.getScore();
			}
		}
		return RuleMatrix.LOW.getScore();
	}

}
