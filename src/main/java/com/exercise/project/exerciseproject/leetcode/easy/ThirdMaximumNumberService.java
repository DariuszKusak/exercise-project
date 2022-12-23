package com.exercise.project.exerciseproject.leetcode.easy;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ThirdMaximumNumberService {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Set<Integer> cache = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!cache.contains(nums[i])) {
                if (heap.size() < 3) {
                    heap.add(nums[i]);
                    cache.add(nums[i]);
                } else {
                    if (heap.peek() < nums[i]) {
                        cache.remove(heap.poll());
                        heap.add(nums[i]);
                        cache.add(nums[i]);
                    }
                }
            }
        }

        return heap.size() == 2 ? Math.max(heap.poll(), heap.poll()) : heap.peek();
    }


    public int thirdMaxV2(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(Arrays.stream(nums).boxed().collect(Collectors.toSet()));

        if (queue.size() >= 3) {
            queue.poll();
            queue.poll();
            return queue.poll();
        } else {
            return queue.stream().mapToInt(i -> i).max().orElse(-1);
        }
    }
}
