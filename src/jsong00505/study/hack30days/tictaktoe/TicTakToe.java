package jsong00505.study.hack30days.tictaktoe;

public class TicTakToe {
	char[] board;
	char userMarker;
	char aiMarker;
	char currentMarker;
	
	TicTakToe(char userMarker, char aiMarker) {
		/*
		 *  initialize constructor
		 */
		this.userMarker = userMarker;
		this.aiMarker = aiMarker;
		this.board = new char[9];
	}
	
	
	public boolean chooseSpot(int number) {
		/*
		 *  check the chosen number is in range and not taken
		 */
		if(number > 0 && number < board.length + 1) {
			if(board[number-1] != '-') {
				return false;
			} else {
				board[number-1] = this.currentMarker;
				return true;
			}
		} else {
			return false;
		}
		
		// maybe I can do a modular above two logic. 
	}
	
	public void resetBoard() {
		/*
		 * reset board for restart game
		 */
		System.out.println("Reset board");
		for(int i = 0; i < board.length; i++) {
			this.board[i] = '-';
		}
		System.out.println();
	}
	
	public void printBasicBoard() {
		/*
		 * show basic style of board
		 * so user can know which number can take which spot
		 * 
		 */
		System.out.println("Print basic board");
		for(int i = 0; i < board.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------");
			}
			System.out.print("|  " + (i+1));
		}
		System.out.println();
	}
	
	public void printCurrentBoard() {
		/*
		 * show current board
		 * so user can know how game is going
		 * 
		 */
		System.out.println("Print current board");
		for(int i = 0; i < board.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------");
			}
			System.out.print("|  " + board[i]);
		}
		System.out.println();
	}
	
}
