package com.exercise.project.exerciseproject.leetcode.easy.string;

import org.springframework.stereotype.Service;

@Service
public class FindLUSLengthService {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        return Math.max(a.length(),b.length());
    }

}
