package com.exercise.project.exerciseproject.ztm.graphs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

@Service
public class NumOfMinutesService {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if (manager.length == 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }

        List<HashSet<Integer>> managementStructure = IntStream.rangeClosed(0, n - 1).mapToObj(idx -> new HashSet<Integer>()).toList();

        for (int i = 0; i < n; i++) {
            if (i != headID) {
                int directManager = manager[i];
                Set<Integer> subOrdinates = managementStructure.get(directManager);
                subOrdinates.add(i);
            }
        }

        return calculateTime(headID, informTime, managementStructure, 0, new ArrayList<>()).stream().mapToInt(integer -> integer).max().orElse(-1);
    }

    private List<Integer> calculateTime(int managerId, int[] informTime, List<HashSet<Integer>> managementStructure, int minutes, List<Integer> results) {
        HashSet<Integer> subOrdinates = managementStructure.get(managerId);

        if (!subOrdinates.isEmpty()) {
            minutes += informTime[managerId];
            results.add(minutes);

            for (int subordinate : subOrdinates) {
                calculateTime(subordinate, informTime, managementStructure, minutes, results);
            }
        }

        return results;
    }

    //    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
//        if (manager.length == 0) {
//            return 0;
//        }
//
//        int maxMinutes = -1;
//        Map<Integer, Integer> timeToRoot = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            if (!timeToRoot.containsKey(manager[i])) {
//                int rootTime = calculateToRoot(i, headID, manager, informTime, 0);
//                timeToRoot.put(manager[i], rootTime);
//                maxMinutes = Math.max(maxMinutes, rootTime);
//            }
//        }
//        return maxMinutes;
//    }
//
//    private int calculateToRoot(int i, int headID, int[] manager, int[] informTime, int minutes) {
//        if (i == headID) {
//            return minutes;
//        } else {
//            int directManager = manager[i];
//            minutes += informTime[directManager];
//            return calculateToRoot(directManager, headID, manager, informTime, minutes);
//        }
//    }


}
