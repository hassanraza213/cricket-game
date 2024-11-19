package model;

public class Team {
	
	private String teamName;
	private int toss;
	private double totalOvers;
	private int wicketsCount;
	private String win;
	private int totalScore;
	private String tossChoice;
	private String result;
	
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public double getTotalOvers() {
		return totalOvers;
	}
	
	public void setTotalOvers(double totalOvers) {
		this.totalOvers = totalOvers;
	}
	
	public int getWicketsCount() {
		return wicketsCount;
	}
	
	public void setWicketsCount(int wicketsCount) {
		this.wicketsCount = wicketsCount;
	}
	
	public String getWin() {
		return win;
	}
	
	public void setWin(String win) {
		this.win = win;
	}
	
	public int getToss() {
		return toss;
	}
	
	public void setToss(int toss) {
		this.toss = toss;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getTossChoice() {
		return tossChoice;
	}

	public void setTossChoice(String tossChoice) {
		this.tossChoice = tossChoice;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	

}
