package LLD3.Tictactoe.Strategies.winningstrategy;

import LLD3.Tictactoe.models.Move;
import LLD3.Tictactoe.models.Player;
import LLD3.Tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
    private Map<Integer,Map<Symbol,Integer>> colHashmaps = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, int N) {

        int col=move.getCell().getColumn();
        Symbol symbol = move.getPlayer().getSymbol();
        if(!colHashmaps.containsKey(col)){
            colHashmaps.put(col, new HashMap<>());
        }

        Map<Symbol,Integer> mp=colHashmaps.get(col);
        mp.put(symbol,mp.getOrDefault(symbol,0)+1);

        int count=mp.get(symbol);
        if(count==N){
            return true;
        }else{
            return false;
        }
    }
}
