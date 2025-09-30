package LLD3.Tictactoe.Strategies.BOTStrategies;

import LLD3.Tictactoe.enums.CellState;
import LLD3.Tictactoe.models.Board;
import LLD3.Tictactoe.models.Cell;
import LLD3.Tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Cell chooseCellToPlay(Board board) {
        for(List<Cell> cells : board.getBoard()) {
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return cell;
                }
            }
        }
        return null;
    }
}
