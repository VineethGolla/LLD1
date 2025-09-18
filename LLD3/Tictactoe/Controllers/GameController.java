package LLD3.Tictactoe.Controllers;

import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;
import LLD3.Tictactoe.exceptions.BOTCountInvalidexception;
import LLD3.Tictactoe.exceptions.PlayerCountNotValidException;
import LLD3.Tictactoe.models.Game;
import LLD3.Tictactoe.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) throws BOTCountInvalidexception, PlayerCountNotValidException {
        return Game.getBuilder().
                setDimension(4).
                setPlayers(players).
                setWinningStrategies(winningStrategies).
                build();
    }

    public void makeMove(Game game){

        game.makeMove();
    }

    public void undo(){

    }

    public void printBoard(Game game){
        game.printBoard();
    }
}
