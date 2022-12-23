package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class FloodFillService {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void fill(int[][] image, int row, int column, int colorToChange, int color) {
        if (image[row][column] == colorToChange && image[row][column] != color) {
            image[row][column] = color;

            if (row - 1 >= 0) {
                fill(image, row - 1, column, colorToChange, color);
            }

            if (row + 1 < image.length) {
                fill(image, row + 1, column, colorToChange, color);
            }

            if (column - 1 >= 0) {
                fill(image, row, column - 1, colorToChange, color);
            }

            if (column + 1 < image[row].length) {
                fill(image, row, column + 1, colorToChange, color);
            }

        }

    }
}
