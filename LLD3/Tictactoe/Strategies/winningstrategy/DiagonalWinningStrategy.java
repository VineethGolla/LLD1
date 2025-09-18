package LLD3.Tictactoe.Strategies.winningstrategy;

import LLD3.Tictactoe.models.Move;
import LLD3.Tictactoe.models.Player;
import LLD3.Tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol,Integer> leftDiagHashmap = new HashMap<>();
    private Map<Symbol, Integer> rightDiagHashmap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move,int N) {
        int row=move.getCell().getRow();
        int col=move.getCell().getColumn();
        Symbol symbol=move.getPlayer().getSymbol();

        //if row,col is part of left diagonal

        if(row==col){
            leftDiagHashmap.put(symbol,leftDiagHashmap.getOrDefault(symbol,0) + 1);
            if(leftDiagHashmap.get(symbol) == N){
                return true;
            }else {
                return false;
            }
        }

        if(row+col==N-1){
            rightDiagHashmap.put(symbol,rightDiagHashmap.getOrDefault(symbol,0) + 1);
//            if(rightDiagHashmap.get(symbol) == N){
//                return true;
//            }else{
//                return false;
//            }
        }

        /*if else
        return leftDiagHashmap.get(symbol) == N || rightDiagHashmap.get(symbol) == N;
    }
}
