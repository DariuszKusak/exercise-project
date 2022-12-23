package com.exercise.project.exerciseproject.stack;

import com.exercise.project.exerciseproject.ztm.stack.StackExerciseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StackExerciseServiceTest {

    @Autowired
    private StackExerciseService stackExerciseService;

    @Test
    void isValid() {
//        assertEquals("()()", stackExerciseService.minRemoveToMakeValid("())()((("));
//        assertEquals("", stackExerciseService.minRemoveToMakeValid("))(("));
        assertEquals("", stackExerciseService.minRemoveToMakeValid("(a(b(c)d)"));
    }

}