package com.exercise.project.exerciseproject.array.multi.dimentional;

import com.exercise.project.exerciseproject.ztm.array.multi.dimentional.WallsAndGatesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WallsAndGatesServiceTest {

    @Autowired
    WallsAndGatesService service;

    @Test
    void wallsAndGates() {
        int[][] grid = new int[][]{
                new int[]{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                new int[]{Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                new int[]{0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        int[][] ints = service.wallsAndGates(grid);

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "   ");
            }
            System.out.println();
        }
    }

}