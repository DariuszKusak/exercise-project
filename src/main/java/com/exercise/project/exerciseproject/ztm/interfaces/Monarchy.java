package com.exercise.project.exerciseproject.ztm.interfaces;

import java.util.List;

public interface Monarchy {
    void birth(String child, String parent);

    void death(String name);

    List<String> getOrderOfSuccession();
}
