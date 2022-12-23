package com.exercise.project.exerciseproject.ztm.stack;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Stack;

@Service
public class StackExerciseService {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        Map<Character, Character> brackets = Map.of('(', ')', '[', ']', '{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (brackets.containsKey(s.charAt(i))) {
                characterStack.push(s.charAt(i));
            } else {
                if (characterStack.isEmpty()) {
                    return false;
                }
                Character pop = characterStack.pop();

                if (brackets.get(pop) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

    public String minRemoveToMakeValidBruteForce(String s) {
        if (s.length() == 0) {
            return "";
        }
        Stack<Character> characterStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                characterStack.push(s.charAt(i));
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (characterStack.isEmpty()) {

                } else if (s.charAt(i) == ')') {
                    sb.append(s.charAt(i));
                    characterStack.pop();
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        String result = sb.toString();

        while (!characterStack.isEmpty()) {
            result = result.replaceFirst("\\(", "");
            characterStack.pop();
        }

        sb = new StringBuilder(result);
        sb.reverse();

        return sb.toString();
    }

    public String minRemoveToMakeValid(String s) {
        Stack<BracketDto> brackets = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(') {
                brackets.push(new BracketDto(i, '('));
            } else if (current == ')') {
                if (brackets.isEmpty()) {
                    brackets.push(new BracketDto(i, ')'));
                } else if (brackets.peek().getBracket() == '(') {
                    brackets.pop();
                } else {
                    brackets.push(new BracketDto(i, ')'));
                }
            }
        }

        while (!brackets.isEmpty()) {
            BracketDto current = brackets.pop();
            sb.deleteCharAt(current.getIndex());
        }

        return sb.toString();
    }

    class BracketDto {
        private int index;
        private char bracket;

        public BracketDto(int index, char bracket) {
            this.index = index;
            this.bracket = bracket;
        }

        public int getIndex() {
            return index;
        }

        public char getBracket() {
            return bracket;
        }
    }
}
