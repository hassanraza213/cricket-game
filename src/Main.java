 
import java.util.List;

import model.OpponentTeams;
import model.Team;
import services.Match;
	
	public class Main extends Match {
	
		public static void main(String[] args) {
			
			
			Main main = new Main();
			
			OpponentTeams opponentTeams = main.getTeamNames();
			main.play();
		}
	}
