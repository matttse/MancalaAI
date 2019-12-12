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
	
//	public static HashMap<String, Integer> gameBoard = new HashMap<String, Integer>();//track game board state
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board.initializeBoard();
		int bucketChoice = 0;
		int binValue = 0;
		int nextBinValue = 0;
		
		//while game board top row or bottom row is not empty
//		while (isRowEmpty() == false) {
			//while player 1 move last stone in pit
			//player 1 move
			if (bucketChoice == 0) {
				binValue = Integer.valueOf(Board.gameBoard.get(String.valueOf(bucketChoice)));
				Board.gameBoard.put(String.valueOf(bucketChoice), 0);
				while (binValue > 0) {
					bucketChoice =  (Integer.valueOf(bucketChoice) + 1) % 13;
					Board.gameBoard.put(String.valueOf(bucketChoice), Board.gameBoard.get(bucketChoice));
					binValue--;
				}
				 
				
				
			}
			
			
			//while player 2 move last stone in pit
			//player 2 move
			
			
			Board.printState();
//		}

				
	}
	
	


	
	

}
