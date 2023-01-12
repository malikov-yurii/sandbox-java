package cci.ch_8_recursion_and_dynamic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// TODO: 12.01.2023 Rework as in Book solution - cleaner and more elegant 
public class T_8_2_RobotInGrid {

    private final LinkedList<Direction> path;
    private final boolean[][] grid;
    private final int height;
    private final int width;
    private boolean pathFound;
    private Set<Integer> visitedCells;

    private static int countVerifications;

    public T_8_2_RobotInGrid(boolean[][] grid) {
        this.grid = grid;
        this.path = new LinkedList<>();
        this.visitedCells = new HashSet<>();
        this.height = this.grid.length;
        this.width = this.grid[0].length;
    }

    private List<Direction> getPath() {
        countVerifications = 0;
        buildPath(0, 0);
        System.out.printf("countVerifications=%d", countVerifications);
        return this.path;
    }

    private void buildPath(int i, int j) {
        countVerifications++;
        pathFound = pathFound || i == height - 1 && j == width - 1;
        if (shouldCheckCell(i + 1, j)) {
            path.addLast(Direction.DOWN);
            buildPath(i + 1, j);
            if (pathFound) {
                return;
            }
            path.removeLast();
        }
        if (shouldCheckCell(i, j + 1)) {
            path.addLast(Direction.RIGHT);
            buildPath(i, j + 1);
            if (pathFound) {
                return;
            }
            path.removeLast();
        }
    }

    private boolean shouldCheckCell(int i, int j) {
        return i < height && j < width && grid[i][j] && visitedCells.add(width * i + j);
    }


    public static List<Direction> findPath(boolean[][] grid) {
        return new T_8_2_RobotInGrid(grid).getPath();
    }

    enum Direction {
        RIGHT, DOWN
    }

}
