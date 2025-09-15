package LLD3.Tictactoe;

import LLD3.Tictactoe.Controllers.GameController;
import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;
import LLD3.Tictactoe.enums.PlayerType;
import LLD3.Tictactoe.exceptions.BOTCountInvalidexception;
import LLD3.Tictactoe.exceptions.PlayerCountNotValidException;
import LLD3.Tictactoe.models.Game;
import LLD3.Tictactoe.models.Player;
import LLD3.Tictactoe.models.Symbol;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws BOTCountInvalidexception, PlayerCountNotValidException {
//        List<Player> players =new ArrayList<Player>();
        Player p1=new Player("vinny", new Symbol('V',""), PlayerType.HUMAN);
        Player p2= new Player("vinny", new Symbol('K',""), PlayerType.HUMAN);
        Player p3 = new Player("vinny", new Symbol('U',""), PlayerType.HUMAN);

        List<Player> players= List.of(p1,p2,p3);
        List<WinningStrategy> winningStrategies= new ArrayList<>();

        GameController gameController = new GameController();
        gameController.startGame(5, players, winningStrategies);

        System.out.println();
    }

}
