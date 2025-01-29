package com.fintech.riskmanagementservic.service.impl;

import java.util.List;

import com.fintech.riskmanagementservic.rule.CompanyNameRule;
import com.fintech.riskmanagementservic.rule.CompanyStatusRule;
import com.fintech.riskmanagementservic.rule.CompanyTypeRule;
import com.fintech.riskmanagementservic.rule.ConfirmationStatementRule;
import com.fintech.riskmanagementservic.rule.IncorporationDateRule;
import com.fintech.riskmanagementservic.rule.IndustrySectorRule;
import com.fintech.riskmanagementservic.rule.NatureOfBusinessRule;
import com.fintech.riskmanagementservic.rule.RegisterNumberRule;
import com.fintech.riskmanagementservic.rule.ResignedDirectorsRule;
import com.fintech.riskmanagementservic.rule.StatementOfCapitalRule;
import com.fintech.riskmanagementservic.rule.WebDomainRule;
import com.fintech.riskmanagementservic.service.RiskRule;

public class RiskReportRegister {

	public List<RiskRule> getRules() {
		return List.of(new CompanyNameRule(), 
				new CompanyStatusRule(), 
				new CompanyTypeRule(),
				new IncorporationDateRule(), 
				new IncorporationDateRule(), 
				new NatureOfBusinessRule(),
				new ResignedDirectorsRule(), 
				new StatementOfCapitalRule(), 
				new ConfirmationStatementRule(),
				new WebDomainRule(), 
				new IndustrySectorRule(), 
				new RegisterNumberRule(), 
				new RegisterNumberRule());
	}

}
