package model;

import java.util.HashMap;

public class Board extends Bucket{
	public static String playerTwoScore = "";//p2 score tracker
	public static String playerOneScore = "";//p1 score tracker	
	public static String topRowOutput = ("| ");//Player 2 output
	public static String botRowOutput = ("| ");//Player 1 output
	public static HashMap<String, Integer> gameBoard = new HashMap<String, Integer>();//track game board state
	/*
	 * check if top row or bottom row is empty
	 * */
	public static boolean isRowEmpty() {
		boolean status = true;
		int topRow = 0;
		int bottomRow = 0;
		for (int i = 0; i < 6; i++) {			
			topRow += (Integer.valueOf(gameBoard.get(String.valueOf(i+1))));				
		}
		for (int i = 7; i < 13; i++) {			
			bottomRow += (Integer.valueOf(gameBoard.get(String.valueOf(i+1))));				
		}
		if (bottomRow > 0 || topRow > 0) {
			status = false;
		}
		return status;
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
		int cnt = 0;//counter to initialize buckets		
		/*Fill out game board*/
		do {			
			gameBoard.put(String.valueOf(cnt), 4);
			cnt++;
		} while (cnt < 14);
		//Print output
		
		for (int i = 0; i < 13; i++) {
			if (i == 6 || i ==13) {//scoring bins
				
			} else {
				if (i % 2 == 0) {//even, player 1
					botRowOutput += (gameBoard.get(String.valueOf(i+1)));
					botRowOutput += (" | ");	
				} else {//odd, player 2
					topRowOutput += (gameBoard.get(String.valueOf(i+1)));
					topRowOutput += (" | ");					
				}	
			}			
		}
		
	}
}
