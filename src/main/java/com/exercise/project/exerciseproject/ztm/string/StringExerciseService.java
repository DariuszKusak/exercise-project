package com.exercise.project.exerciseproject.ztm.string;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StringExerciseService {
    public boolean backspaceCompareBruteForce(String s, String t) {
        return clearString(s).equals(clearString(t));
    }

    public boolean backspaceCompare(String s, String t) {
        int p1 = s.length() - 1;
        int p2 = t.length() - 1;

        while (p1 >= 0 || p2 >= 0) {
            if (s.charAt(p1) == '#' && t.charAt(p2) == '#') {
                if (s.charAt(p1) == '#') {
                    int counter = 2;
                    while (counter > 0) {
                        counter--;
                        p1--;
                        if (s.charAt(p1) == '#') {
                            counter = 2;
                        }
                    }
                }
                if (s.charAt(p2) == '#') {
                    int counter = 2;
                    while (counter > 0) {
                        counter--;
                        p2--;
                        if (t.charAt(p2) == '#') {
                            counter = 2;
                        }
                    }
                }
            } else {
                if (s.charAt(p1) != t.charAt(p2)) {
                    return false;
                }
                p1--;
                p2--;
            }

        }
        return true;
    }

    public int lengthOfLongestSubstringBruteForce(String s) {
        String temp = "";
        String longest = "";

        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {
            temp = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (temp.contains(String.valueOf(s.charAt(j)))) {
                    if (longest.length() < temp.length()) {
                        longest = temp;
                    }
                    temp = "";
                } else {
                    temp += String.valueOf(s.charAt(j));
                    if (longest.length() < temp.length()) {
                        longest = temp;
                    }
                }

            }
        }
        return longest.length();
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int longest = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        Set<Character> storage = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            storage.clear();
            leftPointer = i - 1;
            rightPointer = i + 1;

            storage.add(s.charAt(i));

            while (leftPointer > 0 || rightPointer < s.length()) {
                if (leftPointer > 0) {
                    if (storage.contains(s.charAt(leftPointer))) {
                        break;
                    } else {
                        storage.add(s.charAt(leftPointer));
                    }
                }
                if (rightPointer < s.length()) {
                    if (storage.contains(s.charAt(rightPointer))) {
                        break;
                    } else {
                        storage.add(s.charAt(rightPointer));
                    }
                }
                leftPointer--;
                rightPointer++;
            }
            if (storage.size() > longest) {
                longest = storage.size();
            }
        }
        return longest;

    }

    public int lengthOfLongestSubstringVer2(String s) {
        HashMap<Character, Integer> storage = new HashMap<>();
        int longest = 0;
        int left = 0;
        if (s.length() < 2) {
            return s.length();
        }
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (storage.containsKey(currentChar) && storage.get(currentChar) >= left) {
                left = storage.get(currentChar) + 1;
            }
            storage.put(currentChar, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

    public boolean isPalindromeBruteForce(String s) {
        StringBuilder result = new StringBuilder(Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .filter(st -> st.matches("[a-z]|[0-9]"))
                .collect(Collectors.joining("")));

        return result.toString().equals(result.reverse().toString());
    }

    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (!Character.isDigit(s.charAt(left)) && !Character.isLetter(s.charAt(left))) {
                left++;
            } else if (!Character.isDigit(s.charAt(right)) && !Character.isLetter(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    private List<Character> clearString(String s) {
        LinkedList<Character> storage = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!storage.isEmpty()) {
                    storage.removeLast();
                }
            } else {
                storage.add(s.charAt(i));
            }
        }

        return storage;
    }

}
