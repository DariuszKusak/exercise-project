package com.exercise.project.exerciseproject.leetcode.easy;

import com.exercise.project.exerciseproject.leetcode.easy.ExcelSheetColumnTitleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ExcelSheetColumnTitleServiceTest {

    @Autowired
    ExcelSheetColumnTitleService service;

    @Test
    void convertToTitle(String column, int columnValue) {
        assertEquals(column, service.convertToTitle(columnValue));
    }

}