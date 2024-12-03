 
import java.util.List;

import model.OpponentTeams;
import model.Team;
import services.Match;
	
	public class Main {
	
		public static void main(String[] args) {
			
			
			Match match = new Match();
			
			OpponentTeams opponentTeams = match.getTeamNames();
			match.play();
		}
	}
