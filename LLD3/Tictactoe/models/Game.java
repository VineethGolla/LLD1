package LLD3.Tictactoe.models;

import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gamestate;
    private int nextMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public Game(Board board, List<Player> players, List<Move> moves, Player winner, GameState gamestate, int nextMovePlayerIndex, List<WinningStrategy> winningStrategies) {
        this.board = board;
        this.players = players;
        this.moves = moves;
        this.winner = winner;
        this.gamestate = gamestate;
        this.nextMovePlayerIndex = nextMovePlayerIndex;
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
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
}
