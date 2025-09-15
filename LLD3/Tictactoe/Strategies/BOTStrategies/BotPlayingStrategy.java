package LLD3.Tictactoe.Strategies.BOTStrategies;

import LLD3.Tictactoe.models.Board;
import LLD3.Tictactoe.models.Move;

public interface BotPlayingStrategy {
    default Move makeMove(Board board){
        return null;
    }
}
