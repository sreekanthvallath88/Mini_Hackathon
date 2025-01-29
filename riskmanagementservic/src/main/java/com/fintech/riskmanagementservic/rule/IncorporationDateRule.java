package com.fintech.riskmanagementservic.rule;

import com.fintech.riskmanagementservic.common.RuleMatrix;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.service.RiskRule;

public class IncorporationDateRule implements RiskRule{

	
	@Override
	public int calculate(Company company) {
		int dateDiff = 0 ;//company.getIncoporateDate().YEAR_FIELD - LocalDate.now().getYear();
		if(dateDiff>7) {
			return RuleMatrix.LOW.getScore();
		} else if (dateDiff>1){
			return RuleMatrix.MEDIUM.getScore();
		} else {
			return RuleMatrix.HIGH.getScore();
		}
	}

}
