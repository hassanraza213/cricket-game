package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import model.Team;

public class Match {
	
	 List<Team> addMatchDetailsArrayList = new ArrayList<>();
	
	private void getTeamNames() {
		Scanner inputTeamName = new Scanner(System.in);
		Team teamOne = new Team();
		
		System.out.println(" Enter your team name ");
		teamOne.setTeamName(inputTeamName.nextLine());
		addMatchDetailsArrayList.add(teamOne);
		
		Team teamTwo = new Team();
		
		System.out.println(" Enter your oponent's team name ");
		teamTwo.setTeamName(inputTeamName.nextLine());
		addMatchDetailsArrayList.add(teamTwo);
	}
	
	public static String tossValidation(String userChoiceValidation) {
		Scanner validatingChoice = new Scanner(System.in);
		if(userChoiceValidation.equalsIgnoreCase("bat") || userChoiceValidation.equalsIgnoreCase("bowl")) {
			return userChoiceValidation;
		} else {
			System.out.println(" Invalid choice ! Either choose bat or bowl ");
			userChoiceValidation = validatingChoice.nextLine();
			return tossValidation(userChoiceValidation);
		}
	}
	
	private void toss() {
		Team teamToss1 = addMatchDetailsArrayList.get(0);
		Team teamToss2 = addMatchDetailsArrayList.get(1);
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

		
		if (chooseOne == tossResult) {
			
			Scanner chooseForTeamOne = new Scanner(System.in);
			
		    System.out.println(addMatchDetailsArrayList.get(0).getTeamName() + " has won the toss");
		    System.out.println("Do you want to bat or bowl first?");
		   
		    String chooseBatOrBowlOne = tossValidation(chooseForTeamOne.nextLine());
		    teamToss1.setTossChoice(chooseBatOrBowlOne);
		   
		    String oppositeChoice = chooseBatOrBowlOne.equalsIgnoreCase("bat") ? "bowl" : "bat";
		    teamToss2.setTossChoice(oppositeChoice);
		    
		    addMatchDetailsArrayList.set(0, teamToss1);
		    addMatchDetailsArrayList.set(1, teamToss2);
		    
		    System.out.println(addMatchDetailsArrayList.get(1).getTeamName() + " will " + oppositeChoice + " first");
		} else {
			
			Scanner chooseForTeamTwo = new Scanner(System.in);
			
		    System.out.println(addMatchDetailsArrayList.get(1).getTeamName() + " has won the toss");
		    System.out.println("Do you want to bat or bowl first?");
		   
		    String chooseBatOrBowlTwo = tossValidation(chooseForTeamTwo.nextLine());
		    teamToss2.setTossChoice(chooseBatOrBowlTwo);
		    
		    String oppositeChoice = chooseBatOrBowlTwo.equalsIgnoreCase("bat") ? "bowl" : "bat";
		    teamToss1.setTossChoice(oppositeChoice);
		    
		    addMatchDetailsArrayList.set(1, teamToss2);
		    addMatchDetailsArrayList.set(0, teamToss1);

		    System.out.println(addMatchDetailsArrayList.get(0).getTeamName() + " will " + oppositeChoice + " first");
		}
	}
	
	
	
	private void overs() {
		Team team1Score = addMatchDetailsArrayList.get(0);
		Team team2Score = addMatchDetailsArrayList.get(1);
		
		System.out.println();
		System.out.println(" ---- Start of Overs ---- ");
		System.out.println();
	    
		Scanner askForOvers = new Scanner(System.in);

	    System.out.println("How many overs do you want to play? (10 or 20): ");
	    int totalOvers = askForOvers.nextInt();

	    System.out.println(" ---- Match Details ---- ");
	    System.out.println();
	    System.out.println("Team 1: " + addMatchDetailsArrayList.get(0).getTeamName());
	    System.out.println("Team 2: " + addMatchDetailsArrayList.get(1).getTeamName());
	    System.out.println();
	    
	    String team1TossChoice = addMatchDetailsArrayList.get(0).getTossChoice();
	    String team2TossChoice = addMatchDetailsArrayList.get(1).getTossChoice();
	    
	    boolean batFirst = team1TossChoice.equalsIgnoreCase("bat");
	    
	    if (batFirst) {
	    	System.out.println();
	        System.out.println(addMatchDetailsArrayList.get(0).getTeamName() + " will bat first.");
	        
	    } else {
	    	System.out.println();
	        System.out.println(addMatchDetailsArrayList.get(1).getTeamName() + " will bat first.");
	        
	    }
	    
	    System.out.println();
	    System.out.println(" -----  ---  ----- ");
	    
	    for (int i = 0; i < 2; i++) {
	        
	    	System.out.println();
	    	String battingTeam = batFirst ? addMatchDetailsArrayList.get(i).getTeamName() : addMatchDetailsArrayList.get(1 - i).getTeamName();
	       
	        int scorePerOver = 0 ;
		    double currentOver = 0;
	    	int currentRuns = 0 ;	
	    	int currentWicket= 0 ;
	    	
	    	currentWicket = 0 ;
	        
	    	for (int over = 1; over <= totalOvers; over++) {
	           
	    			currentOver ++;
	        		currentRuns = 0;
	        		
	            for (int ball = 1; ball <= 6; ball++) {
	              	
	            	Random randomRuns = new Random();
	            	int outcome = randomRuns.nextInt(9) + 1;
	            	
	            	switch (outcome) {
                    case 1:
                    	{                	
                        int runs = randomRuns.nextInt(6) + 1;
                        currentRuns += runs;    
                        break;              
                    	}   
                    case 7:
                    	{
                    	currentWicket++;
                    	if(currentWicket == 10) {
                    		break;
                    	}
                        break;  
                    	}    
                    case 8: 
                    	{
                        currentRuns++; 
                        ball--;	
                        break;
                    	}
                    case 9:
                    	{
                        Random runOutCheck = new Random();
                        boolean isRunOut = runOutCheck.nextBoolean(); 
                        
	                        if (isRunOut) {
	                            currentWicket++; 
	                        } else {
	                            
	                            int noBallRuns = runOutCheck.nextInt(6) + 1; 
	                            currentRuns += noBallRuns;
	                        }
                        ball--;
                        break;
                    	}
                    default:
                    	{
                        break;
                    	}
                }
	            	scorePerOver += currentRuns;
	                
	            	if(currentWicket == 10) {
	            		break;
	            	}
	            }
	            
	            if (battingTeam.equals(addMatchDetailsArrayList.get(0).getTeamName())) {
		            team1Score.setTotalScore(scorePerOver);
		            team1Score.setWicketsCount(currentWicket);
		            team1Score.setTotalOvers(currentOver);
		            
		        } else {
		            team2Score.setTotalScore(scorePerOver);
		            team2Score.setWicketsCount(currentWicket);
		            team2Score.setTotalOvers(currentOver);
		        }
	           
	            if(currentWicket == 10) {
	            	break;
	            }
	        }
	    }
	}
	
	
	private void resultDisplay() {
		Team team1Result = addMatchDetailsArrayList.get(0);
		Team team2Result = addMatchDetailsArrayList.get(1);
		
		
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

	    for (Team team : addMatchDetailsArrayList) {
	        System.out.printf("%-20s %-15d %-15d %-15.1f %-10s\n", 
	                          team.getTeamName(), 
	                          team.getTotalScore(), 
	                          team.getWicketsCount(), 
	                          team.getTotalOvers(),
	                          team.getResult());
	    }
	}
	
	public void play() {
		this.getTeamNames();
		this.toss();
		this.overs();
		this.resultDisplay();
	}
}
