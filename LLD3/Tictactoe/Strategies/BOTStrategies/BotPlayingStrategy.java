package LLD3.Tictactoe.Strategies.BOTStrategies;

import LLD3.Tictactoe.models.Board;
import LLD3.Tictactoe.models.Cell;

public interface BotPlayingStrategy {
    Cell chooseCellToPlay(Board board);
}
