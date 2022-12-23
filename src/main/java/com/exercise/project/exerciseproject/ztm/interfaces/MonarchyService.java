package com.exercise.project.exerciseproject.ztm.interfaces;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;


public class MonarchyService implements Monarchy {

    private Lord king;
    private Map<String, Lord> lords;

    public MonarchyService(String name) {
        this.king = new Lord(name);
        this.lords = new HashMap<>();
        this.lords.put(king.name, king);
    }

    @Override
    public void birth(String child, String parent) {
        Lord parentLord = getLord(parent);
        Lord childLord = new Lord(child);
        parentLord.getChildren().add(childLord);
        lords.put(child, childLord);
    }

    private Lord getLord(String name) {
        return Optional.ofNullable(this.lords.get(name))
                .orElseThrow(() -> new NoSuchElementException("Lord %s does not exist" + name));
    }

    @Override
    public void death(String name) {
        Lord lord = getLord(name);
        lord.isAlive = false;
    }

    @Override
    public List<String> getOrderOfSuccession() {
        return getOrderOfSuccession(king, new LinkedList<>());
    }

    private List<String> getOrderOfSuccession(Lord lord, LinkedList<String> orderOfSuccession) {
        if (lord.isAlive) {
            orderOfSuccession.add(lord.getName());
        }

        lord.getChildren().forEach(child -> getOrderOfSuccession(child, orderOfSuccession));

        return orderOfSuccession;
    }


    @Getter
    @ToString
    @EqualsAndHashCode
    class Lord {
        private final String name;
        private LinkedList<Lord> children;
        private boolean isAlive;

        public Lord(String name) {
            this.name = name;
            this.children = new LinkedList<>();
            this.isAlive = true;
        }
    }

}
