
public class Soccer_Team {
	private static int Wins;
	private static int Losses;
	private static int Ties;
	private static int numberOfTeams = 1;
	private static int points = 0;
	private static int gamesPlayed;
	private int Goals;

	public void determine (int win, int loss, int tie){
		this.Wins = win;
		this.Losses = loss;
		this.Ties = tie;
		numberOfTeams++;
	}
	
	public void played(Soccer_Team Opponent, int myScore, int opponentScore){
		
			if (myScore > opponentScore) {
				this.Wins++;
				Opponent.Losses++;
			}
			else if(myScore < opponentScore) {
				this.Losses++;
				Opponent.Wins++;
			}
			else if(myScore == opponentScore) {
				this.Ties++;
				Opponent.Ties++;
			}
			gamesPlayed++;
			Goals = Goals + myScore + opponentScore;
	}
	
	public int getWin(){
		return Wins;
	}
	public int getLoss(){
		return Losses;
	}
	public int getTie() {
		return Ties;
	}
	public static int getScore(){
		points = points + (3 * Wins) + Ties;
		return points;
	}
	public void reset(){
		this.Wins = 0;
		this.Losses = 0; 
		this.Ties = 0;
	}
	public static int getnumberOfGamesPlayed(){
		return gamesPlayed;
	}
	public static int getNumberOfTeams() {
		return numberOfTeams++;
	}
	public void getstartOfTournament(){
		gamesPlayed = 0;
		Goals = 0;
	}
}
