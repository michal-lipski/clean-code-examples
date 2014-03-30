package com.clean.code;


import com.clean.code.naming.Game;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class BadNamedAppTest {


    public static final int SELECTED = 4;

    @Test
    public void returns_selected_items() throws Exception {
        int[][] board = new int[][]{
                {1, 5},
                {2, 6},
                {3, 7},
                {SELECTED, 8}};

        List<int[]> flagged = new Game().getThem(board);

        Assertions.assertThat(flagged).containsExactly(new int[]{4, 8});

    }
}
