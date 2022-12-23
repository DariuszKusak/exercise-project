package com.exercise.project.exerciseproject.ztm.array.multi.dimentional;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Service
public class BFSService {
    public int[] bfs(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] seen = new boolean[matrix.length][matrix[0].length];
        queue.add(new int[]{0, 0});
        List<Integer> storage = new ArrayList<>(matrix.length * matrix[0].length);

        while (!queue.isEmpty()) {
            int[] currentNode = queue.poll();
            int row = currentNode[0];
            int column = currentNode[1];

            if (row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length && !seen[row][column]) {
                seen[row][column] = true;
                storage.add(matrix[row][column]);
                queue.add(new int[]{row - 1, column});
                queue.add(new int[]{row, column + 1});
                queue.add(new int[]{row + 1, column});
                queue.add(new int[]{row, column - 1});
            }
        }
        return storage.stream().mapToInt(integer -> integer).toArray();
    }


}
