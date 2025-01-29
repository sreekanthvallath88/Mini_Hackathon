package com.fintech.riskmanagementservic.common;

public enum RuleMatrix {
	LOW(10),
	MEDIUM(7),
	HIGH_GO(3),
	HIGH(0);
	
	private final int score;
	
	

	private RuleMatrix(int score) {
		this.score = score;
	}



	public int getScore() {
		return score;
	}
	
}
