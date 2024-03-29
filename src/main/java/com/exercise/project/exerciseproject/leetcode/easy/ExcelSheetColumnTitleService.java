package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class ExcelSheetColumnTitleService {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber>0) {
            sb.append((char)('A' + columnNumber%26));
            columnNumber = columnNumber/26;
        }


        return sb.reverse().toString();
    }


}
