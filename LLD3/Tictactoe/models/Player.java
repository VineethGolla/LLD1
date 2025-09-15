package LLD3.Tictactoe.models;

import LLD3.Tictactoe.enums.PlayerType;

public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;

    public Player(String name,Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
    }

    public Move makeMove(){
        return null;
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
}
