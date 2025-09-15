package LLD3.Tictactoe.models;

import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;
import LLD3.Tictactoe.enums.GameState;
import LLD3.Tictactoe.exceptions.BOTCountInvalidexception;
import LLD3.Tictactoe.exceptions.PlayerCountNotValidException;
import LLD3.Tictactoe.enums.PlayerType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gamestate;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilder() {
        return new Builder();
    }

    Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.nextMovePlayerIndex = 0;
        this.gamestate=GameState.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
    }

    public Player checkWinner(){
        for(WinningStrategy winningStrategy: winningStrategies){
            winningStrategy.checkWinner();
        }
        return null;
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) { this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGamestate() {
        return gamestate;
    }

    public void setGamestate(GameState gamestate) {
        this.gamestate = gamestate;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validateUniqueSymbols() throws RuntimeException{
            HashMap<Character,Integer> map=new HashMap<>();
            for(Player player:players){
                map.put(player.getSymbol().getAchar(), map.getOrDefault(player.getSymbol().getAchar(), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                if(value>1){
                    throw new RuntimeException("characters reusing");
                }
            }

        }
        private void validatePlayerCount() throws PlayerCountNotValidException {
            if(players.size() != dimension-1){
                throw new PlayerCountNotValidException("not valid no. of players");
            }
        }
        private void validate() throws PlayerCountNotValidException, BOTCountInvalidexception, RuntimeException {
            validateBOTCount();
            validatePlayerCount();
            validateUniqueSymbols();
        }

        private void validateBOTCount() throws BOTCountInvalidexception {
            int botCount = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }
            if (botCount > dimension - 2) {
                throw new BOTCountInvalidexception("not valid no. of bots");
            }
        }

        public Game build() throws BOTCountInvalidexception, PlayerCountNotValidException, RuntimeException {
            //Builder - Perform all the validations check and
            //if all are passing, then create the obj, otherwise throw exceptions
            validate();
            return new Game(dimension,players,winningStrategies);
        }
    }
}
