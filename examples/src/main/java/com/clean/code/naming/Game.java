package com.clean.code.naming;

import java.util.ArrayList;
import java.util.List;


public class Game {

    public static final int FLAGGED = 4;
    public static final int STATUS_VALUE = 0;

    public List<int[]> getFlaggedFields(int[][] gameBoard) {
        List<int[]> flaggedFields = new ArrayList<int[]>();
        for (int[] fields : gameBoard)
            if (isFlagged(fields)) {
                flaggedFields.add(fields);
            }
        return flaggedFields;
    }

    private boolean isFlagged(int[] fields) {
        return fields[STATUS_VALUE] == FLAGGED;
    }


}
