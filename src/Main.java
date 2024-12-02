 
import java.util.List;

import model.OpponentTeams;
import model.Team;
import utils.Innings;
	
	public class Main {
	
		public static void main(String[] args) {
			
			
			Innings innings = new Innings();
			
			OpponentTeams opponentTeams = innings.getTeamNames();
			 innings.toss();
			innings.overs();
			innings.resultDisplay();
		}
	}
