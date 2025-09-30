package LLD3.Tictactoe;

import LLD3.Tictactoe.Controllers.GameController;
import LLD3.Tictactoe.Strategies.winningstrategy.ColumnWinningStrategy;
import LLD3.Tictactoe.Strategies.winningstrategy.DiagonalWinningStrategy;
import LLD3.Tictactoe.Strategies.winningstrategy.RowWinningStrategy;
import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;
import LLD3.Tictactoe.enums.BotDifficultyLevel;
import LLD3.Tictactoe.enums.GameState;
import LLD3.Tictactoe.enums.PlayerType;
import LLD3.Tictactoe.exceptions.BOTCountInvalidexception;
import LLD3.Tictactoe.exceptions.PlayerCountNotValidException;
import LLD3.Tictactoe.models.Bot;
import LLD3.Tictactoe.models.Game;
import LLD3.Tictactoe.models.Player;
import LLD3.Tictactoe.models.Symbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws BOTCountInvalidexception, PlayerCountNotValidException {
//        List<Player> players =new ArrayList<Player>();
        Player p1=new Player("vinny", new Symbol('V',""), PlayerType.HUMAN);
        Player p2= new Bot("thea", new Symbol('K',""), BotDifficultyLevel.EASY);
//        Player p3 = new Player("random", new Symbol('U',""), PlayerType.HUMAN);

//        Player p4= new Bot("boot", new Symbol('B',""), PlayerType.BOT,BotDifficultyLevel.EASY);
//        players.add(p1);
//        players.add(p2);
//        players.add(p3);

        List<Player> players= List.of(p1,p2);
        List<WinningStrategy> winningStrategies= new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        GameController gameController = new GameController();
        Game game= gameController.startGame(3, players, winningStrategies);
        Scanner scanner = new Scanner(System.in);

        while(game.getGamestate().equals(GameState.IN_PROGRESS)){
            //Show/Print the current board
            //Tell whose turn is it and ask him to select row,column
            //execute the move if it's valid
            gameController.printBoard(game);
            gameController.makeMove(game);

            //ask if player want to unDo
            System.out.println("Do you want to unDo y/n");
            String undoMove=scanner.next();

            if(undoMove.equalsIgnoreCase("y")){
                gameController.unDo(game);
            }
        }

        if(game.getGamestate().equals(GameState.ENDED)){
            System.out.println("winner is : " + game.getWinner());
        }else{
            System.out.println("Game is Draw");
        }

        System.out.println();
    }

}
