package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

@Service
public class AddBinaryService {
    public String addBinary(String a, String b) {
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int tail = 0;

        while (pa >= 0 || pb >= 0) {
            int sum = tail;

            if (pa >= 0) {
                sum += a.charAt(pa) == '1' ? 1 : 0;
                pa--;
            }
            if (pb >= 0) {
                sum += b.charAt(pb) == '1' ? 1 : 0;
                pb--;
            }

            tail = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }

        return tail == 1 ? sb.append("1").reverse().toString() : sb.reverse().toString();
    }

}
