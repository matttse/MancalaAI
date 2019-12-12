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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cnt = 1;
		HashMap<String, String> gameBoard = new HashMap<String, String>();
		do {
			
			gameBoard.put("a".concat(String.valueOf(cnt)), "4");
			cnt++;
		} while (cnt <= 6);
		cnt = 1;
		do {
			
			gameBoard.put("b".concat(String.valueOf(cnt)), "4");
			cnt++;
		} while (cnt <= 6);
		String output = "";
		for (int i = 1; i < 7; i++) {
			if (mod(i,2)) {
				System.out.print("| ".concat(gameBoard.get("a".concat(String.valueOf(i)))));
			}
			System.out.print(gameBoard.get("a".concat(String.valueOf(i))));
//			output.concat("| ".concat(gameBoard.get("a".concat(String.valueOf(i)))));
//			System.out.println(output);
		}
		
//		System.out.println(output);
		
		
	}
	public static boolean mod(int a, int b){
	    if ( a < 0 ){
	        return false;
	    }else if (a==b){ 
	        return true;
	    }else{ 
	        return mod( a-b, b );
	    }
	}
	
	

}
