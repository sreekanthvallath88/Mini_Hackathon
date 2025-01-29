package com.fintech.riskmanagementservic.response;

public class CreditScoreResponse {
	
	private int score;
	private String riskLevel;
	
	public CreditScoreResponse(int score, String riskLevel) {
		this.score = score;
		this.riskLevel = riskLevel;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	
	

}
