package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import model.Team;
import services.Match;

public class Player {
	
	
	private String firstName;
	private String lastName;
	private int score;
	private String status;
	
	public Player() {
	    
	}
	
	public Player(String firstName, String lastName, int score, String status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.status = status;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	static Match innings = new Match();
	
	public static List<Player> getPakistanPlayers() {
		
		
		List<Player> team1Players = new ArrayList<Player>();
	        
		Player player1 = new Player();
	    player1.setFirstName("Shoaib");
	    player1.setLastName("Akhtar");
	    team1Players.add(player1);

	    Player player2 = new Player();
	    player2.setFirstName("Wasim");
	    player2.setLastName("Akram");
	    team1Players.add(player2);

	    Player player3 = new Player();
	    player3.setFirstName("Imran");
	    player3.setLastName("Khan");
	    team1Players.add(player3);

        Player player4 = new Player();
        player4.setFirstName("Shahid");
	    player4.setLastName("Afridi");
	    team1Players.add(player4);

	    Player player5 = new Player();
	    player5.setFirstName("Younis");
	    player5.setLastName("Khan");
	    team1Players.add(player5);

	    Player player6 = new Player();
	    player6.setFirstName("Javed");
	    player6.setLastName("Miandad");
	    team1Players.add(player6);

	    Player player7 = new Player();
	    player7.setFirstName("Fakhar");
	    player7.setLastName("Zaman");
	    team1Players.add(player7);

	    Player player8 = new Player();
	    player8.setFirstName("Babar");
	    player8.setLastName("Azam");
	    team1Players.add(player8);

	    Player player9 = new Player();
	    player9.setFirstName("Mohammad");
	    player9.setLastName("Hafeez");
	    team1Players.add(player9);

	    Player player10 = new Player();
	    player10.setFirstName("Sarfaraz");
	    player10.setLastName("Ahmed");
	    team1Players.add(player10);
	    
	    return team1Players;

	}
	
	public static List<Player> getIndiaPlayers() {
		
		
	    List<Player> team2Players = new ArrayList<Player>();
	    
	    Player player1 = new Player();
	    player1.setFirstName("Sachin");
	    player1.setLastName("Tendulkar");
	    team2Players.add(player1);

	    Player player2 = new Player();
	    player2.setFirstName("Virat");
	    player2.setLastName("Kohli");
	    team2Players.add(player2);

	    Player player3 = new Player();
	    player3.setFirstName("MS");
	    player3.setLastName("Dhoni");
	    team2Players.add(player3);

	    Player player4 = new Player();
	    player4.setFirstName("Rohit");
	    player4.setLastName("Sharma");
	    team2Players.add(player4);

	    Player player5 = new Player();
	    player5.setFirstName("Kapil");
	    player5.setLastName("Dev");
	    team2Players.add(player5);

	    Player player6 = new Player();
	    player6.setFirstName("Sunil");
	    player6.setLastName("Gavaskar");
	    team2Players.add(player6);

	    Player player7 = new Player();
	    player7.setFirstName("Yuvraj");
	    player7.setLastName("Singh");
	    team2Players.add(player7);

	    Player player8 = new Player();
	    player8.setFirstName("Ravindra");
	    player8.setLastName("Jadeja");
	    team2Players.add(player8);

	    Player player9 = new Player();
	    player9.setFirstName("Anil");
	    player9.setLastName("Kumble");
	    team2Players.add(player9);

	    Player player10 = new Player();
	    player10.setFirstName("Jasprit");
	    player10.setLastName("Bumrah");
	    team2Players.add(player10);
	   
	    return team2Players;
	}

	
	public static List<Player> getAustraliaPlayers() {
		
	    List<Player> team3Players = new ArrayList<Player>();
	    
	    Player player1 = new Player();
	    player1.setFirstName("Ricky");
	    player1.setLastName("Ponting");
	    team3Players.add(player1);

	    Player player2 = new Player();
	    player2.setFirstName("Steve");
	    player2.setLastName("Smith");
	    team3Players.add(player2);

	    Player player3 = new Player();
	    player3.setFirstName("Glenn");
	    player3.setLastName("McGrath");
	    team3Players.add(player3);

	    Player player4 = new Player();
	    player4.setFirstName("Shane");
	    player4.setLastName("Warne");
	    team3Players.add(player4);

	    Player player5 = new Player();
	    player5.setFirstName("Adam");
	    player5.setLastName("Gilchrist");
	    team3Players.add(player5);

	    Player player6 = new Player();
	    player6.setFirstName("Michael");
	    player6.setLastName("Clarke");
	    team3Players.add(player6);

	    Player player7 = new Player();
	    player7.setFirstName("Matthew");
	    player7.setLastName("Hayden");
	    team3Players.add(player7);

	    Player player8 = new Player();
	    player8.setFirstName("Brett");
	    player8.setLastName("Lee");
	    team3Players.add(player8);

	    Player player9 = new Player();
	    player9.setFirstName("David");
	    player9.setLastName("Warner");
	    team3Players.add(player9);

	    Player player10 = new Player();
	    player10.setFirstName("Pat");
	    player10.setLastName("Cummins");
	    team3Players.add(player10);
	    
	    return team3Players;
	}

	
}
