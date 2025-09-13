package LLD3.Tictactoe.Strategies.winningstrategy;

import LLD3.Tictactoe.models.Board;
import LLD3.Tictactoe.models.Cell;
import LLD3.Tictactoe.models.Player;

public interface WinningStrategy {
    default boolean CheckWinner(Board board, Player player, Cell cell){

    }
}
