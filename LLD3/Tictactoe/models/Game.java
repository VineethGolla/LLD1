package LLD3.Tictactoe.models;

import LLD3.Tictactoe.Strategies.winningstrategy.WinningStrategy;
import LLD3.Tictactoe.enums.CellState;
import LLD3.Tictactoe.enums.GameState;
import LLD3.Tictactoe.exceptions.BOTCountInvalidexception;
import LLD3.Tictactoe.exceptions.PlayerCountNotValidException;
import LLD3.Tictactoe.enums.PlayerType;

import java.util.*;

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

    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.nextMovePlayerIndex = 0;
        this.gamestate=GameState.IN_PROGRESS;
        this.winningStrategies = winningStrategies;
    }

    public void printBoard(){
        board.print();
    }

    public void unDo(){
        if(moves.size()==0){
            System.out.println("No moves on the board, undo isn't possible");
            return;
        }

        /*
        1.Remove last move from the list
        2. Remove the move from the board
         */

        Move LastMove =moves.get(moves.size()-1);
        moves.remove(LastMove);

        Cell cell=LastMove.getCell();
        cell.setCellState(CellState.EMPTY);
        cell.setPlayer(null);
        nextMovePlayerIndex = (nextMovePlayerIndex - 1+ players.size())%players.size();

        //update the maps
        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleunDo(LastMove, board.getSize());
        }
    }

    private boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy: winningStrategies){
            if(winningStrategy.checkWinner(move, board.getSize())){
                return true;
            }
        }
        return false;
    }

    public void makeMove(){
    //who is the next player to play
        Player currentPlayer = players.get(nextMovePlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s move");

        //ask that player to make a move
        Cell dummyCell = currentPlayer.chooseCellToPlay(board);
        int row=dummyCell.getRow();
        int column=dummyCell.getColumn();

        if(!validateMove(dummyCell.getRow(), dummyCell.getColumn())){
            System.out.println("It's an invalid Move, please try again");
            return;
        }

        //Is the move executed?
        //marking the cell as filled and putting the player inside the cell
        //executing the move on the board
        Cell cell=board.getBoard().get(row).get(column);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(currentPlayer);

        Move move = new Move(currentPlayer, cell);

        moves.add(move);

        //Update nextPlayerIndex
        nextMovePlayerIndex=(nextMovePlayerIndex+1) % players.size();

        //check whether this is a winning move?

        if(checkWinner(move)){
            gamestate=GameState.ENDED;
            winner=currentPlayer;
        }else if(moves.size() == board.getBoard().size() * board.getBoard().size()){
            gamestate=GameState.DRAW;
        }
    }

    public boolean validateMove(int row, int col){
        if(row<0 || col<0 || row>=board.getSize() || col>= board.getSize()){
            return false;
        }
        //extract cell object from the board corresponding to this row,col

        if(board.getBoard().get(row).get(col).getCellState().equals(CellState.FILLED)){
            return false;
        }

        return true;
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
