package LLD3.Tictactoe.models;


import LLD3.Tictactoe.enums.CellState;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int dimension){
        this.dimension = dimension;
        this.board = new ArrayList<List<Cell>>();

        for(int i=0;i<dimension;i++){
            board.add(new ArrayList<>());

            for(int j=0;j<dimension;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }
    void print(){
        for(List<Cell> cells:board){
            for(Cell cell: cells){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    System.out.print("|  |");
                }else{
                    System.out.print("| " +cell.getPlayer().getSymbol().getAchar() + " |");
                }
            }
            System.out.println();
        }
    }
    public Board(int size, List<List<Cell>> board) {
        this.dimension = size;
        this.board = board;
    }

    public int getSize() {

        return dimension;
    }

    public void setSize(int size) {
        this.dimension = size;
    }

    public List<List<Cell>> getBoard() {

        return board;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
