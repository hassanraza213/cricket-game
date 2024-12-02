package model;

import java.util.List;

public class Team {
	
	private String teamName;
	private int toss;
	private double totalOvers;
	private int wicketsCount;
	private String win;
	private int totalScore;
	private String tossChoice;
	private String result;
	private List<Player> playersList;
	private String choosenTeam;
	
	public Team() {
	}

	public Team(String teamName, List<Player> playersList) {
		this.teamName = teamName;
		this.playersList = playersList;
	}

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

	public List<Player> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(List<Player> playersList) {
		this.playersList = playersList;
	}
	
	public String getChoosenTeam() {
		return choosenTeam;
	}

	public void setChoosenTeam(String choosenTeam) {
		this.choosenTeam = choosenTeam;
	}

	public static Team  getPakistanTeamObject() {
		return  new Team("Pakistan", Player.getPakistanPlayers());
	}
	
	public static Team  getIndiaTeamObject() {
		return  new Team("India", Player.getIndiaPlayers());
	}
	
	public static Team  getAustraliaTeamObject() {
		return  new Team("Australia", Player.getAustraliaPlayers());
	}
}
