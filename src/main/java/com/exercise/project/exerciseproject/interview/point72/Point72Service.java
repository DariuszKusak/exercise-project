package com.exercise.project.exerciseproject.interview.point72;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class Point72Service {

    // List<Integer> intersection(List<Integer> list1, List<Integer> list2)
    public List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
        return validInputLists(list1, list2)
                ? intersectionValidatedLists(list1, list2)
                : Collections.emptyList();
    }

    //This method can be extended in future for many lists intersection
    private List<Integer> intersectionValidatedLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> secondListAsSet = new HashSet<>(list2);

        return list1.stream()
                .distinct()
                .filter(secondListAsSet::contains)
                .collect(Collectors.toList());
    }

    private boolean validInputLists(List<Integer> ... lists) {
        return Arrays.stream(lists)
                .allMatch(this::validateList);
    }

    private boolean validateList(List<Integer> list) {
        return list != null && !list.isEmpty();
    }

}
