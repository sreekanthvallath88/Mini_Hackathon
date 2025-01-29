package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;


public class WebDomainRule implements RiskRule{

	@Override
	public int calculate(Company company) {
		String webDomain = company.getCompanyWebDomain();
		if(StringUtil.notNullNorEmpty(webDomain)) {
			if (webDomain.matches("https?://(www\\.)?[a-zA-Z0-9]+\\.(com|co\\.uk)")) {
				return RuleMatrix.LOW.getScore();
	        } else if (webDomain.matches("https?://(www\\.)?[a-zA-Z0-9]+\\.[a-z]{2,}$")){
	        	return RuleMatrix.MEDIUM.getScore();
	        } else {
	        	//company.getWebDomain().matches("https?://(^www\\.[^a-zA-Z0-9]+\\.(xyz|top|biz|info|online|club|site)$"
	        	return RuleMatrix.HIGH.getScore();
	        }
		}
		return RuleMatrix.HIGH.getScore();
		
	}
}
