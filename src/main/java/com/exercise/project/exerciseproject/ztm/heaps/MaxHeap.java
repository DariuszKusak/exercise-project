package com.exercise.project.exerciseproject.ztm.heaps;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class MaxHeap {
    private List<Integer> heap;
    private Comparator<Integer> comparator;

    public MaxHeap(List<Integer> data, Comparator<Integer> comparator) {
        this.comparator = comparator;
        heap = new ArrayList<>(data.stream()
                .sorted(comparator)
                .toList());
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException();
        }
        return heap.get(0);
    }

    public void push(Integer data) {
        heap.add(data);

        if (heap.size() > 1) {
            int currentIndex = heap.size() - 1;

            while (currentIndex > 0) {
                int parentIndex = (currentIndex - 1) / 2;

                if (comparator.compare(heap.get(currentIndex), heap.get(parentIndex)) < 0) {
                    int tmp = heap.get(parentIndex);
                    heap.set(parentIndex, heap.get(currentIndex));
                    heap.set(currentIndex, tmp);
                    currentIndex = parentIndex;
                } else {
                    break;
                }
            }
        }
    }

    public void pop() {
        if (heap.isEmpty()) {
            throw new IllegalStateException();
        }
        if (heap.size() == 1) {
            heap.remove(0);
        } else {
            heap.set(0, heap.remove(heap.size() - 1));
            int currentIndex = 0;

            while (currentIndex * 2 + 1 <= heap.size() - 1) {
                int left = currentIndex * 2 + 1;
                int right = left + 1;

                if (right <= heap.size() - 1) {


                    if (comparator.compare(heap.get(left), heap.get(right)) < 0) {
                        swap(currentIndex, left);
                        currentIndex = left;
                    } else {
                        swap(currentIndex, right);
                        currentIndex = right;
                    }
                } else {
                    swap(left, currentIndex);
                    currentIndex = left;
                }
            }
        }
    }

    private void swap(int left, int right) {
        int tmp = heap.get(left);
        heap.set(left, heap.get(right));
        heap.set(right, tmp);
    }

    public void print() {
        System.out.println(heap);
    }


}
