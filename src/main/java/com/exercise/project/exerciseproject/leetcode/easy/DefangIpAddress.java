package com.exercise.project.exerciseproject.leetcode.easy;

public class DefangIpAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
