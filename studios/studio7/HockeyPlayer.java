package studio7;

public class HockeyPlayer {
    private String name;
    private int number;
    private boolean isrighthanded;
    private boolean shootright;
    private boolean shootleft;
    private int goals;
    private int assists;
    private int games;
    /**
     * 
     * @param name
     * @param number
     * @param isrighthanded
     * @param shootright
     * @param shootleft
     * @param goals
     * @param assists
     * @param games
     */
	public HockeyPlayer(String name, int number, boolean isrighthanded, boolean shootright, boolean shootleft,
			int goals, int assists, int games) {
		this.name = name;
		this.number = number;
		this.isrighthanded = isrighthanded;
		this.shootright = shootright;
		this.shootleft = shootleft;
		this.goals = goals;
		this.assists = assists;
		this.games = games;
	}
	/**
	 * 
	 * @return player name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return player jersey number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * 
	 * @return if it is right handed
	 */
	public boolean isIsrighthanded() {
		return isrighthanded;
	}
	/**
	 * 
	 * @return if he or she shoot right or not
	 */
	public boolean isShootright() {
		return shootright;
	}
	/**
	 * 
	 * @return if he or she shoot left or not
	 */
	public boolean isShootleft() {
		return shootleft;
	}
	/**
	 * 
	 * @return the goals he get
	 */
	public int getGoals() {
		return goals;
	}
	/**
	 * 
	 * @return the assists he get
	 */
	public int getAssists() {
		return assists;
	}
	/**
	 * 
	 * @return the games he or she played
	 */
	public int getGames() {
		return games;
	}
	/**
	 * 
	 * @return points he or she get
	 */
	public int points(){
		return goals+assists;
	}
    
}
