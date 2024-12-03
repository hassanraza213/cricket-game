package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.OpponentTeams;
import model.Player;
import model.Team;

	public class Match {
		
		public List<Team> addMatchDetailsArrayList = new ArrayList<>();
		OpponentTeams opponentTeams = new OpponentTeams();
		
		public  OpponentTeams getTeamNames() {
			
			Team pakistanTeam =  Team.getPakistanTeamObject();
			addMatchDetailsArrayList.add(pakistanTeam);
		    
			Team indiaTeam = Team.getIndiaTeamObject();
			addMatchDetailsArrayList.add(indiaTeam);
			
			Team australiaTeam = Team.getAustraliaTeamObject();
		    addMatchDetailsArrayList.add(australiaTeam);
			
		    
			Random randomTeamName = new Random();
			
			if(addMatchDetailsArrayList.size() >= 2) {
				int randomTeam1Index = randomTeamName.nextInt(addMatchDetailsArrayList.size());
				Team teamOne = addMatchDetailsArrayList.get(randomTeam1Index);
				opponentTeams.setTeamOne(teamOne);
				int randomTeam2Index;
				do {
					randomTeam2Index = randomTeamName.nextInt(addMatchDetailsArrayList.size());
				} while(randomTeam1Index == randomTeam2Index);
				
				Team teamTwo = addMatchDetailsArrayList.get(randomTeam2Index);
				opponentTeams.setTeamTwo(teamTwo);
				System.out.println(" Team one is "+teamOne.getTeamName());
				System.out.println(" Team Two is "+teamTwo.getTeamName());
				
			}
			return opponentTeams;
		}
		
		public  String tossValidation(String userChoiceValidation) {
			
			Scanner validatingChoice = new Scanner(System.in);
			if(userChoiceValidation.equalsIgnoreCase("bat") || userChoiceValidation.equalsIgnoreCase("bowl")) {
				return userChoiceValidation;
			} else {
				System.out.println(" Invalid choice ! Either choose bat or bowl ");
				userChoiceValidation = validatingChoice.nextLine();
				return tossValidation(userChoiceValidation);
			}
		}
		
		public  void toss() {
			
			Scanner tossWin =  new Scanner(System.in);
			
			System.out.println();
			System.out.println(" ----- It's toss time ----- ");
			System.out.println();
			
			System.out.println(" Enter ' 0 ' for Heads & ' 1 ' for Tails ");
			int chooseOne = tossWin.nextInt();
			boolean isFalse = false;
			
			while(isFalse != true) {
				if(chooseOne == 0 || chooseOne == 1) {
					isFalse = true;	
				} else {
					System.out.println(" Enter between ' 0 ' OR ' 1 ' only ");
					chooseOne = tossWin.nextInt();
					isFalse = false;
				}
			}
			
			Random random = new Random();
			int tossResult = random.nextInt(2);
			System.out.println("Your Choice: " + chooseOne);
			System.out.println("Toss Result: " + tossResult);
			
		    Team teamOne = opponentTeams.getTeamOne();
		    Team teamTwo = opponentTeams.getTeamTwo();
			
		    if (chooseOne == tossResult) {
		    	
		    	Scanner teamOneTossInput = new Scanner(System.in);
		    	
		        System.out.println(teamOne.getTeamName() + " has won the toss. Do you want to bat or bowl?");
		        String choice = tossValidation(teamOneTossInput.next());
		        teamOne.setTossChoice(choice);
		        teamTwo.setTossChoice(choice.equalsIgnoreCase("bat") ? "bowl" : "bat");
		        opponentTeams.setBattingChoosingTeam(teamOne);
		        opponentTeams.setBowlingChoosingTeam(teamTwo);
		        System.out.println(teamTwo.getTeamName() + " will " + teamTwo.getTossChoice() + " first.");
		    } else {
		    	
		    	Scanner teamTwoTossInput = new Scanner(System.in);
		    	
		        System.out.println(teamTwo.getTeamName() + " has won the toss. Do you want to bat or bowl?");
		        String choice = tossValidation(teamTwoTossInput.next());
		        teamTwo.setTossChoice(choice);
		        teamOne.setTossChoice(choice.equalsIgnoreCase("bat") ? "bowl" : "bat");
		        opponentTeams.setBattingChoosingTeam(teamTwo);
		        opponentTeams.setBowlingChoosingTeam(teamOne);
		        System.out.println(teamOne.getTeamName() + " will " + teamOne.getTossChoice() + " first.");
		    }
		    
		    addMatchDetailsArrayList.add(teamOne);
		    addMatchDetailsArrayList.add(teamTwo);
		}
	
	
	
		public void overs() {
		    Team team1Score = opponentTeams.getTeamOne();
		    Team team2Score = opponentTeams.getTeamTwo();

		    System.out.println();
		    System.out.println(" ---- Start of Overs ---- ");
		    System.out.println();

		    Scanner askForOvers = new Scanner(System.in);

		    System.out.println("How many overs do you want to play? (10 or 20): ");
		    int totalOvers = askForOvers.nextInt();

		    System.out.println(" ---- Match Details ---- ");
		    System.out.println();
		    System.out.println("Team 1: " + opponentTeams.getTeamOne().getTeamName());
		    System.out.println("Team 2: " + opponentTeams.getTeamTwo().getTeamName());
		    System.out.println();

		    String team1Choice = opponentTeams.getBattingChoosingTeam().getTossChoice();
		    String team2Choice = opponentTeams.getBowlingChoosingTeam().getTossChoice();

		    boolean batFirst = team1Choice.equalsIgnoreCase("bat");

		    if (batFirst) {
		        System.out.println();
		        System.out.println(opponentTeams.getBattingChoosingTeam().getTeamName() + " will bat first.");
		    } else {
		        System.out.println();
		        System.out.println(opponentTeams.getBowlingChoosingTeam().getTeamName() + " will bat first.");
		    }

		    System.out.println();
		    System.out.println(" -----  ---  ----- ");

		    for (int i = 0; i < 2; i++) {
		        System.out.println();
		        String battingTeam = (i == 0) ? opponentTeams.getBattingChoosingTeam().getTeamName() : opponentTeams.getBowlingChoosingTeam().getTeamName();

		        int scorePerOver = 0;
		        double currentOver = 0;
		        int currentRuns = 0;
		        int currentWicket = 0;

		        currentWicket = 0;

		        Random random = new Random();
		        List<Player> playersList = (i == 0) ? opponentTeams.getBattingChoosingTeam().getPlayersList() : opponentTeams.getBowlingChoosingTeam().getPlayersList();
		        Player currentBatter = playersList.get(random.nextInt(playersList.size())); 

		        for (int over = 1; over <= totalOvers; over++) {
		            currentOver++;
		            currentRuns = 0;

		            for (int ball = 1; ball <= 6; ball++) {
		                Random randomRuns = new Random();
		                int outcome = randomRuns.nextInt(100) + 1;

		                if (outcome >= 1 && outcome <= 40) {
		                  
		                } else if (outcome >= 41 && outcome <= 50) {
		                    currentRuns += 1;
		                } else if (outcome >= 51 && outcome <= 60) {
		                    currentRuns += 2;
		                } else if (outcome >= 61 && outcome <= 65) {
		                    currentRuns += 3;
		                } else if (outcome >= 66 && outcome <= 75) {
		                    currentRuns += 4;
		                } else if (outcome >= 76 && outcome <= 80) {
		                    currentRuns += 6;
		                } else if (outcome >= 81 && outcome <= 85) {
		                    currentRuns += 1;
		                    ball--; 
		                } else if (outcome >= 86 && outcome <= 90) {
		                    currentRuns += 1;
		                    ball--; 

		                    int runOutChance = randomRuns.nextInt(100) + 1;
		                    if (runOutChance <= 10) {
		                        currentWicket++;
		                    }
		                } else if (outcome >= 91 && outcome <= 100) {
		                    currentWicket++;
		                    if (currentWicket == 10) {
		                        break;
		                    }
		                }

		                scorePerOver += currentRuns;

		                if (random.nextInt(100) < 10) {
		                   
		                    currentBatter.setStatus("Out");

		                    currentWicket++;
		                    if (currentWicket == 10) {
		                        break;
		                    }

		                    currentBatter = playersList.get(random.nextInt(playersList.size()));
		                }

		                currentBatter.setScore(currentBatter.getScore() + currentRuns);

		                if (currentWicket == 10) {
		                    break;
		                }
		            }

		            if (battingTeam.equals(opponentTeams.getTeamOne().getTeamName())) {
		                team1Score.setTotalScore(scorePerOver);
		                team1Score.setWicketsCount(currentWicket);
		                team1Score.setTotalOvers(currentOver);
		            } else {
		                team2Score.setTotalScore(scorePerOver);
		                team2Score.setWicketsCount(currentWicket);
		                team2Score.setTotalOvers(currentOver);
		            }

		            if (currentWicket == 10) {
		                break;
		            }
		        }
		    }
		}


	
		public void resultDisplay() {
		    Team team1Result = opponentTeams.getTeamOne();
		    Team team2Result = opponentTeams.getTeamTwo();

		    if (team1Result.getTotalScore() > team2Result.getTotalScore()) {
		        team1Result.setResult("Won");
		        team2Result.setResult("Lost");
		    } else if (team1Result.getTotalScore() < team2Result.getTotalScore()) {
		        team1Result.setResult("Lost");
		        team2Result.setResult("Won");
		    } else {
		        team1Result.setResult("Tie");
		        team2Result.setResult("Tie");
		    }

		    System.out.println("Team Name          Total Score    Total Wickets    Total Overs    Result");
		    System.out.println("------------------------------------------------------------------------");
		    System.out.printf("%-20s %-15d %-15d %-15.1f %-10s\n", 
		                      team1Result.getTeamName(), 
		                      team1Result.getTotalScore(), 
		                      getTotalWickets(team1Result.getPlayersList()), 
		                      team1Result.getTotalOvers(),
		                      team1Result.getResult());
		    
		    System.out.println("-------------------------------------------------------------");
		    for (Player player : team1Result.getPlayersList()) {
		        String playerStatus = (player.getStatus() == null || player.getStatus().isEmpty()) ? "Did not bat" : player.getStatus();
		        System.out.printf("%-20s %-15d %-15s\n", 
		                          player.getFirstName() + " " + player.getLastName(), 
		                          player.getScore(), 
		                          playerStatus);
		    }

		    System.out.println("\n-------------------------------------------------------------\n");

		    System.out.printf("%-20s %-15d %-15d %-15.1f %-10s\n", 
		                      team2Result.getTeamName(), 
		                      team2Result.getTotalScore(), 
		                      getTotalWickets(team2Result.getPlayersList()), 
		                      team2Result.getTotalOvers(),
		                      team2Result.getResult());

		    System.out.println("-------------------------------------------------------------");
		    for (Player player : team2Result.getPlayersList()) {
		        String playerStatus = (player.getStatus() == null || player.getStatus().isEmpty()) ? "Did not bat" : player.getStatus();
		        System.out.printf("%-20s %-15d %-15s\n", 
		                          player.getFirstName() + " " + player.getLastName(), 
		                          player.getScore(), 
		                          playerStatus);
		    }
		}

		private int getTotalWickets(List<Player> playersList) {
		    int totalWickets = 0;
		    for (Player player : playersList) {
		        if (player.getStatus() != null && !player.getStatus().equals("Did not bat") && !player.getStatus().equals("Not Out")) {
		            totalWickets++;
		        }
		    }
		    return totalWickets;
	}
	public void play() {
			this.toss();
			this.overs();
			this.resultDisplay();
		}
}
