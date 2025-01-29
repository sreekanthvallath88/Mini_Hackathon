package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

import ch.qos.logback.core.util.StringUtil;


public class IndustrySectorRule implements RiskRule {

	@Override
	public int calculate(Company company) {

		String[] highRiskSectors = { "Gambling", "Cannabis", "Adult Entertainment" };
		String[] mediumRiskSectors = { "Financial Services", "Cryptocurrencies", "Healthcare" };
		for (String sector : highRiskSectors) {
			if (StringUtil.notNullNorEmpty(company.getIndustrySector()) && company.getIndustrySector().equals(sector)) {
				return RuleMatrix.HIGH.getScore();
			}
		}

		for (String sector : mediumRiskSectors) {
			if (StringUtil.notNullNorEmpty(company.getIndustrySector()) && company.getIndustrySector().equals(sector)) {
				return RuleMatrix.MEDIUM.getScore();
			}
		}
		return RuleMatrix.LOW.getScore();
	}
}
