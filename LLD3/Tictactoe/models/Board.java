package LLD3.Tictactoe.models;


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

    public void setBoard(List<List<Cell>> board) {

        this.board = board;
    }
}
