package cci.ch_8_recursion_and_dynamic;

import java.util.ArrayList;
import java.util.List;

public class T_8_12_EightQueens {

    static final int GRID_SIZE = 8;

    public static List<int[]> getPossiblePlaces() {
        List<int[]> results = new ArrayList<>();
        int[] places = new int[GRID_SIZE];
        placeQueen(places, 0, results);
        return results;
    }

    private static void placeQueen(int[] columns, int row, List<int[]> results) {
        if (row == GRID_SIZE) {
            results.add(columns.clone());
        } else {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (canPlace(columns, row, column)) {
                    columns[row] = column;
                    placeQueen(columns, row + 1, results);
                }
            }
        }
    }

    private static boolean canPlace(int[] places, int row, int column) {
        for (int occupiedRow = 0; occupiedRow < row; occupiedRow++) {
            int occupiedCol = places[occupiedRow];
            if (occupiedCol == column
                    ||  Math.abs(column - occupiedCol) == row - occupiedRow) {
                return false;
            }
        }
        return true;
    }

}
