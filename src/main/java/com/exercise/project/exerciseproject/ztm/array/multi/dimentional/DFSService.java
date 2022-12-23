package com.exercise.project.exerciseproject.ztm.array.multi.dimentional;

import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DFSService {



    public int[] dfs(int[][] matrix) {
        List<Integer> storage = new ArrayList<>(matrix.length * matrix[0].length);
        storage.add(matrix[0][0]);
        boolean[][] seen = new boolean[matrix.length][matrix[0].length];
        seen[0][0] = true;

        return dfs(matrix, 0, 0, seen, storage);
    }

    private int[] dfs(int[][] matrix, int row, int column, boolean[][] seen, List<Integer> result) {
        int down = row + 1;
        int right = column + 1;
        int up = row - 1;
        int left = column - 1;

        if (up >= 0 && !seen[up][column]) {
            seen[up][column] = true;
            result.add(matrix[up][column]);
            dfs(matrix, up, column, seen, result);
        }
        if (right < matrix[row].length && !seen[row][right]) {
            seen[row][right] = true;
            result.add(matrix[row][right]);
            dfs(matrix, row, right, seen, result);
        }
        if (down < matrix.length && !seen[down][column]) {
            seen[down][column] = true;
            result.add(matrix[down][column]);
            dfs(matrix, down, column, seen, result);
        }
        if (left >= 0 && !seen[row][left]) {
            seen[row][left] = true;
            result.add(matrix[row][left]);
            dfs(matrix, row, left, seen, result);
        }

        return result.stream().mapToInt(integer -> integer).toArray();
    }


}
