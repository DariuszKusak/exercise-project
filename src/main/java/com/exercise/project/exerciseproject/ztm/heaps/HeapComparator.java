package com.exercise.project.exerciseproject.ztm.heaps;

import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
public class HeapComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
//        return Integer.compare(o2, o1);
        return Integer.compare(o1, o2);
    }
}
