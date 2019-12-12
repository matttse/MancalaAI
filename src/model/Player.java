package model;

public class Player {

	protected String Name = "";
	protected int move = 0;
	protected int score = 0;
	
	public Player() {
		
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMove() {
		return move;
	}
	public void setMove(int move) {
		this.move = move;
	}
	
}
