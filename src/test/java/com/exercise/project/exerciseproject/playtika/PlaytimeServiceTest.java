package com.exercise.project.exerciseproject.playtika;

import com.exercise.project.exerciseproject.interview.playtika.PlaytimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlaytimeServiceTest {

    @Autowired
    PlaytimeService service;

    @Test
    void addNewUserAndCheckExperience() {
        var userId = 13L;

        service.processExperienceUpdate(userId, 100);
        assertEquals(100, service.getExperience(userId));
    }

    @Test
    void addNewUserAndCheckLevel() {
        var userId = 13L;
        service.processExperienceUpdate(userId, 100);
        assertEquals(1, service.getLevel(13));
    }

    @Test
    void getLevel() {
        var userId = 13L;
        long level = service.getLevel(userId);
        assertEquals(1, service.getLevel(userId));

    }
}