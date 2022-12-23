package com.exercise.project.exerciseproject.interview.playtika;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PlaytimeService implements UserLevelOperations {

    private static final int MAX_EXP = 500000;

    Map<Long, Integer> scoreBoar = Map.of(
            2L, 100,
            3L, 500,
            4L, 1000,
            5L, 5000,
            6L, 10000,
            7L, 20000,
            8L, 30000,
            9L, 40000,
            10L, MAX_EXP
    );

    //userId, Experience
    ConcurrentHashMap<Long, Long> users = new ConcurrentHashMap<>();

    @Override
    public void processExperienceUpdate(long userId, long balanceAdded) {
        if (!users.containsKey(userId)) {
            users.putIfAbsent(userId, balanceAdded);
        } else {
            users.put(userId, users.get(userId) + balanceAdded);
        }
    }

    @Override
    public long getExperience(long userId) {
        return users.getOrDefault(userId, (long) -1);
    }

    @Override
    public long getLevel(long userId) {
        if (users.containsKey(userId)) {
            Long userExperience = users.get(userId);
            return mapExperienceToLevel(userExperience);
        } else {
            return -1;
        }
    }

    private Long mapExperienceToLevel(long userExperience) {
        if (userExperience > MAX_EXP) {
            return 10L;
        } else if (userExperience > 40000) {
            return 9L;
        } else if (userExperience > 30000) {
            return 8L;
        } else if (userExperience > 20000) {
            return 7L;
        } else if (userExperience > 10000) {
            return 6L;
        } else if (userExperience > 5000) {
            return 5L;
        } else if (userExperience > 1000) {
            return 4L;
        } else if (userExperience > 500) {
            return 3L;
        } else {
            return 1L;
        }


//        return userExperience > MAX_EXP ?
//                10L :
//                scoreBoar.entrySet().stream()
//                        .filter(entry -> entry.getValue() < userExperience)
//                        .map(e -> (long) (e.getValue() - 1))
//                        .findFirst()
//                        .orElse((long) 10);
    }

}
