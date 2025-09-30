package LLD3.Tictactoe.models;

import LLD3.Tictactoe.enums.PlayerType;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name,Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
    }


    public Cell chooseCellToPlay(Board board){
        System.out.println("Enter the row number where you want to play>:");
        int row=scanner.nextInt();

        System.out.println("Enter the column number where you want to play>:");
        int col=scanner.nextInt();

        //inform back the caller row,column


        return new Cell(row,col);
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
