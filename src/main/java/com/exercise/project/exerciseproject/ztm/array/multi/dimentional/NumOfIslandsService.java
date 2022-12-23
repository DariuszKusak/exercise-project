package com.exercise.project.exerciseproject.ztm.array.multi.dimentional;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class NumOfIslandsService {

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int[][] directions = new int[][]{new int[]{-1, 0}, new int[]{0, -1}, new int[]{0, 1}, new int[]{1, 0}};

        int islandCounter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islandCounter++;
                    grid[i][j] = '0';
                    sinkIsland(grid, new int[]{i, j}, directions);
                }
            }
        }
        return islandCounter;
    }

    private void sinkIsland(char[][] grid, int[] cell, int[][] directions) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(cell);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int[] direction : directions) {
                int nextRow = current[0] + direction[0];
                int nextColumn = current[1] + direction[1];

                if (nextRow >= 0 && nextRow < grid.length && nextColumn >= 0 && nextColumn < grid[nextRow].length && grid[nextRow][nextColumn] == '1') {
                    grid[nextRow][nextColumn] = '0';
                    queue.add(new int[]{nextRow, nextColumn});
                }
            }
        }
    }

}
