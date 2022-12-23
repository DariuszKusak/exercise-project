package com.exercise.project.exerciseproject.interview.playtika;

public interface UserLevelOperations {
    void processExperienceUpdate(long userId, long balanceAdded);
    long getExperience(long userId);
    long getLevel(long userId);
}
