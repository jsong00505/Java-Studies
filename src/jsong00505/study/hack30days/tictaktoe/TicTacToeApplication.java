package jsong00505.study.hack30days.tictaktoe;

import java.util.Scanner;

public class TicTacToeApplication {
	public static void main(String[] args) {
		// define scanner to get user's input
		Scanner sc = new Scanner(System.in);

		// define the value for playing games
		boolean doYouWantToPlay = true;

		while(doYouWantToPlay) {
			// get user's name
			System.out.println("Tell me what your character's name by one character: ");
			char userMarker = sc.next().charAt(0);
			System.out.println("Hello " + userMarker + "!");

			// get ai's name and AI
			System.out.println("Tell me what your opponent's name by one character: ");
			char aiMarker = sc.next().charAt(0);
			AI ai = new AI();

			// create new game
			TicTakToe game = new TicTakToe(userMarker, aiMarker);
			System.out.println("Okay, ready to play. Here is the board you will play.");
			game.printBasicBoard();
			int spot;

			while("notOver".equals(game.finishGame())) {
				System.out.println("not OVER!");

				// set start turn, but need to change this logic
				game.changeTurn(game.currentMarker);

				// check whose turn
				if (game.currentMarker == userMarker) {
					do {
						System.out.print("It is your turn, choose the spot you want to take: ");
						spot = sc.nextInt();
					} while (!game.takeSpot(spot));
					System.out.println("You took " + spot);
				} else {
					spot = ai.chooseSpot(game);
					game.takeSpot(spot);
					System.out.println(aiMarker + " took " + spot);
				}

				// print current board
				game.printCurrentBoard();
			}

			// ask user to replay the game
			System.out.println("Do you want to play again? If so, enter 'Y': ");
			char response = (sc.next().toUpperCase()).charAt(0);
			if(response != 'Y') {
				doYouWantToPlay = false;
			}
		}
	}
}
