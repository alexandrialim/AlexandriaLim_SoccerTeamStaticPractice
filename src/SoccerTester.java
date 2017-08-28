
public class SoccerTester {
	public static void main(String[] args) {
		
		System.out.println("Tournament #1");
		
		Soccer_Team team1 = new Soccer_Team();
		System.out.println("Team number:"+ team1.getNumberOfTeams());
		Soccer_Team team2 = new Soccer_Team();
		System.out.println("Team number:"+ team2.getNumberOfTeams());
		Soccer_Team team3 = new Soccer_Team();
		System.out.println("Team number:"+ team3.getNumberOfTeams());
		Soccer_Team team4 = new Soccer_Team();
		System.out.println("Team number:"+ team4.getNumberOfTeams());
		
		team1.played(team2, 1, 7);
		team2.played(team3, 6, 2);
		team3.played(team4, 0, 0);
		team4.played(team1, 9, 0);
		
		
		System.out.println("Games played: " + Soccer_Team.getnumberOfGamesPlayed());
		System.out.println("Total points scored: " + Soccer_Team.getScore());
	    System.out.println("Team 1 Points Scored: " + team1.getScore() + ", Team 2 Points Scored: " + team2.getScore());
	    System.out.println("Team 3 Points Scored: " + team3.getScore() + ", Team 4 Points Scored: " + team4.getScore());
	    
	    System.out.println("Tournament #2");
	    team1.played(team2, 3, 5);
		team2.played(team3, 5, 4);
		team3.played(team4, 2, 0);
		team4.played(team1, 5, 5);
		
		System.out.println("Games played: " + Soccer_Team.getnumberOfGamesPlayed());
		System.out.println("Total points scored: " + Soccer_Team.getScore());
	    System.out.println("Team 1 Points Scored: " + team1.getScore() + ", Team 2 Points Scored: " + team2.getScore());
	    System.out.println("Team 3 Points Scored: " + team3.getScore() + ", Team 4 Points Scored: " + team4.getScore());
	    
	}
}
