package jsong00505.study.hack30days.tictaktoe;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jsong on 11/02/2017.
 */
public class AI {
    public int chooseSpot(TicTakToe game) {
        ArrayList<Integer> possibleSpotsTaken = new ArrayList<>();

        for(int i = 0; i < game.board.length; i++) {
            if(game.board[i] == '-') {
                possibleSpotsTaken.add(i+1);
            }
        }

        Random rand = new Random();
        if(possibleSpotsTaken.size() > 0) {
            return possibleSpotsTaken.get(rand.nextInt(possibleSpotsTaken.size()-1));
        } else {
            return -1;
        }

    }
}
