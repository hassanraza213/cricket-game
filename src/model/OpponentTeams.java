package model;

public class OpponentTeams {
	
	private Team teamOne;
	private Team teamTwo;
	private Team battingChoosingTeam;
	private Team bowlingChoosingTeam;
	
	
	public OpponentTeams() {
	}
	
	public OpponentTeams(Team teamOne, Team teamTwo, Team battingChoosingTeam, Team bowlingChoosingTeam) {
		super();
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.battingChoosingTeam = battingChoosingTeam;
		this.bowlingChoosingTeam = bowlingChoosingTeam;
	}

	public Team getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(Team teamOne) {
		this.teamOne = teamOne;
	}
	public Team getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(Team teamTwo) {
		this.teamTwo = teamTwo;
	}

	public Team getBattingChoosingTeam() {
		return battingChoosingTeam;
	}

	public void setBattingChoosingTeam(Team battingChoosingTeam) {
		this.battingChoosingTeam = battingChoosingTeam;
	}

	public Team getBowlingChoosingTeam() {
		return bowlingChoosingTeam;
	}

	public void setBowlingChoosingTeam(Team bowlingChoosingTeam) {
		this.bowlingChoosingTeam = bowlingChoosingTeam;
	}

	
	

}
