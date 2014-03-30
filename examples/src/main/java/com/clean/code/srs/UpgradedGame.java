package com.clean.code.srs;

import java.util.ArrayList;
import java.util.List;


public class UpgradedGame {


    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;

    public List<int[]> getFlaggedCells(int[][] gameBoard) {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }






    public List<Cell> getFlaggedCells2(Cell[] gameBoard) {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }


    private class Cell {
        public boolean isFlagged() {
            return false;
        }
    }
}
