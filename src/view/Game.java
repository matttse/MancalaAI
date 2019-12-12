package view;

import java.util.ArrayList;
import java.util.HashMap;

import model.Board;
import model.Bucket;
import model.Player;
/**
 * 
 */

/**
 * @author Matthew Tse
 *
 */
public class Game {
	public static String playerOneScore = "";//p1 score tracker
	public static String playerTwoScore = "";//p2 score tracker
	public static HashMap<String, String> gameBoard = new HashMap<String, String>();//track game board state
	public static String topRowOutput = ("| ");//Player 2 output
	public static String botRowOutput = ("| ");//Player 1 output
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initializeBoard();
		//while game board top row or bottom row is not empty
			//make move
		printState();
				
	}
	/*
	 * Print the current state of the board with player scores
	 * */
	public static void printState() {
		System.out.println(topRowOutput);
		System.out.println(botRowOutput);
		
		playerOneScore += "Player One Score: " + playerOneScore; 
		playerTwoScore += "Player Two Score: " + playerTwoScore;
		
		System.out.println(playerOneScore);
		System.out.println(playerTwoScore);
	}
	/*
	 * Initialize board with default bucket values
	 * */
	public static void initializeBoard() {
		int cnt = 1;//counter to initialize buckets		
		/*Fill out game board*/
		do {			
			gameBoard.put("a".concat(String.valueOf(cnt)), "4");
			cnt++;
		} while (cnt <= 6);
		cnt = 1;//reset initializer
		do {			
			gameBoard.put("b".concat(String.valueOf(cnt)), "4");
			cnt++;
		} while (cnt <= 6);
		//Print output
		
		for (int i = 0; i < 6; i++) {			
			topRowOutput += (gameBoard.get("a".concat(String.valueOf(i+1))));
			topRowOutput += (" | ");			
		}
		
		for (int i = 0; i <6; i++) {				
			botRowOutput += (gameBoard.get("b".concat(String.valueOf(i+1))));
			botRowOutput += (" | ");		
		}
	}

	
	

}
