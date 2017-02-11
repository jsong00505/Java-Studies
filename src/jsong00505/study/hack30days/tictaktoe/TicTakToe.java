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
		this.currentMarker = userMarker;
		resetBoard();
	}
	
	public void changeTurn(char currentMarker) {
		this.currentMarker = (currentMarker == this.userMarker) ? this.aiMarker : this.userMarker;
	}

	public boolean takeSpot(int number) {
		/*
		 *  check the chosen number is in range and not taken
		 */
		if(number > 0 && number < board.length + 1) {
			if(board[number-1] != '-') {
				System.out.print("Oops, you choose the spot already taken.");
				return false;
			} else {
				board[number-1] = this.currentMarker;
				return true;
			}
		} else {
			System.out.println("Oops, your choose the spot is out of range(1-9).");
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
		printCurrentBoard();
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

	public String finishGame() {
		/*
		 * check the game finished and who wins
		 */
		boolean diagonalAndMiddle = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
		boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
		boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';
		System.out.println("diag: " + diagonalAndMiddle);
		System.out.println("top: " + topAndFirst);
		System.out.println("bottom: " + bottomAndThird);
		if(diagonalAndMiddle || topAndFirst || bottomAndThird) {
			System.out.println("Game is done. Winner is " + currentMarker);
			return "Game is done. Winner is " + currentMarker;
		} else {
			System.out.println("notOver");
			return "notOver";
		}
	}

	public boolean rightDi() {
		return board[0] == board[4] && board[4] == board[8];
	}

	public boolean leftDi() {
		return board[2] == board[4] && board[4] == board[6];
	}

	public boolean middleRow() {
		return board[3] == board[4] && board[4] == board[5];
	}

	public boolean secondCol() {
		return board[1] == board[4] && board[4] == board[7];
	}

	public boolean topRow() {
		return board[0] == board[1] && board[1] == board[2];
	}

	public boolean firstCol() {
		return board[0] == board[3] && board[3] == board[6];
	}

	public boolean bottomRow() {
		return board[6] == board[7] && board[7] == board[8];
	}

	public boolean thirdCol() {
		return board[2] == board[5] && board[5] == board[8];
	}
}
