package com.exercise.project.exerciseproject.threads;

import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RaceConditionService {
    static int n = 0;
    static AtomicInteger atomicN = new AtomicInteger();

    public static int compute(long limit) {
        var executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> {
            for (long i = 0; i < limit; i++) {
                n += 1;
            }
        });

        executor.execute(() -> {
            for (long i = 0; i < limit; i++) {
                n -= 1;
            }
        });

        return n;
    }

    public static int computeSynchronized(long limit) throws InterruptedException {
        var mutex = new Object();

        var t1 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                synchronized (mutex) {
                    n += 1;
                }
            }
        });

        var t2 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                synchronized (mutex) {
                    n -= 1;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return n;
    }

    public static int computeAtomic(long limit) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                atomicN.incrementAndGet();
            }
        });

        var t2 = new Thread(() -> {
            for (long i = 0; i < limit; i++) {
                atomicN.decrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return atomicN.get();
    }

}
