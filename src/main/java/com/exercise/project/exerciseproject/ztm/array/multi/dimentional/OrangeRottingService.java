package com.exercise.project.exerciseproject.ztm.array.multi.dimentional;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class OrangeRottingService {
    public int orangesRotting(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0] == 2 ? 1 : -1;
        }

        Queue<int[]> rotten = new LinkedList<>();
        int minute = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    rotten.add(new int[]{i, j});
                }
            }
        }

        while (!rotten.isEmpty()) {
            int counter = 0;
            int end = rotten.size();

            while (counter < end) {
                if (rotten.peek() != null) {
                    int[] currentRottenOrange = rotten.poll();
                    int row = currentRottenOrange[0];
                    int column = currentRottenOrange[1];
                    //up
                    if (row - 1 >= 0 && grid[row - 1][column] == 1) {
                        grid[row - 1][column] = 2;
                        rotten.add(new int[]{row - 1, column});
                    }
                    //right
                    if (column + 1 < grid[row].length && grid[row][column + 1] == 1) {
                        grid[row][column + 1] = 2;
                        rotten.add(new int[]{row, column + 1});
                    }
                    if (row + 1 < grid.length && grid[row + 1][column] == 1) {
                        grid[row + 1][column] = 2;
                        rotten.add(new int[]{row + 1, column});
                    }
                    if (column - 1 >= 0 && grid[row][column - 1] == 1) {
                        grid[row][column - 1] = 2;
                        rotten.add(new int[]{row, column - 1});
                    }
                }
                counter++;
            }
            minute++;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return minute - 1;
    }

}
