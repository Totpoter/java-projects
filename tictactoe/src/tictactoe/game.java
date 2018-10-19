package tictactoe;
import java.util.Scanner;
public class game {
	public static final int EMPTY = 0;
	public static final int CROSS = 1;
	public static final int CIRCLE = 2;
	
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int CIRCLE_WON = 3;
	
	//Spelfält
	public static final int ROWS = 3, COLS = 3;
	public static int[][] board = new int[ROWS][COLS];
	public static int currentState;
	public static int currentPlayer;
	public static int currentRow, currentCol;
	public static Scanner in = new Scanner(System.in);
	// Själva spelet
	 public static void main(String[] args) {
		 initGame();
		 do {
			 playerMove(currentPlayer);
			 updateGame(currentPlayer, currentRow, currentCol);
		 }
	 }
}