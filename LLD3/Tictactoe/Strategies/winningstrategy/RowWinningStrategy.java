package LLD3.Tictactoe.Strategies.winningstrategy;

import LLD3.Tictactoe.models.Move;
import LLD3.Tictactoe.models.Player;
import LLD3.Tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    private Map<Integer, Map<Symbol, Integer>> rowHashMaps = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, int N) {
        int row=move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        if(!rowHashMaps.containsKey(row)){
            rowHashMaps.put(row, new HashMap<>());
        }

        Map<Symbol,Integer> mp=rowHashMaps.get(row);
        mp.put(symbol,mp.getOrDefault(symbol,0)+1);

        int count=mp.get(symbol);
        if(count==N){
            return true;
        }else{
            return false;
        }

//        rowHashMaps.put(row,mp);
    }
}
