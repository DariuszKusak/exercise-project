package com.exercise.project.exerciseproject.ztm.array.multi.dimentional;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WallsAndGatesService {
    public int[][] wallsAndGates(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == Integer.MAX_VALUE) {
                    grid[i][j] = findShortestPath(grid, new int[]{i, j}, 0, new boolean[grid.length][grid[0].length], new ArrayList<>()).stream().mapToInt(inte -> inte).min().orElse(Integer.MAX_VALUE);
                }
            }
        }
        return grid;
    }

    private List<Integer> findShortestPath(int[][] grid, int[] cell, int pathSize, boolean[][] seen, List<Integer> values) {
        int row = cell[0];
        int column = cell[1];
        seen[row][column] = true;
        pathSize++;

        if (row - 1 >= 0 && grid[row - 1][column] != -1 && !seen[row - 1][column]) {
            if (grid[row - 1][column] == 0) {
                values.add(pathSize);
            } else if (!seen[row - 1][column]) {
                findShortestPath(grid, new int[]{row - 1, column}, pathSize, seen, values);
            }
        }
        if (row + 1 < grid.length && grid[row + 1][column] != -1 && !seen[row + 1][column]) {
            if (grid[row + 1][column] == 0) {
                values.add(pathSize);
            } else if (!seen[row + 1][column]) {
                findShortestPath(grid, new int[]{row + 1, column}, pathSize, seen, values);
            }
        }
        if (column - 1 >= 0 && grid[row][column - 1] != -1 && !seen[row][column - 1]) {
            if (grid[row][column - 1] == 0) {
                values.add(pathSize);
            } else if (!seen[row][column - 1]) {
                findShortestPath(grid, new int[]{row, column - 1}, pathSize, seen, values);
            }
        }
        if (column + 1 < grid[row].length && grid[row][column + 1] != -1 && !seen[row][column + 1]) {
            if (grid[row][column + 1] == 0) {
                values.add(pathSize);
            } else if (!seen[row][column + 1]) {
                findShortestPath(grid, new int[]{row, column + 1}, pathSize, seen, values);
            }
        }

        return values;
    }

}
