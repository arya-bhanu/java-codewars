package org.example;

import java.util.Stack;

public class Kata {
    public static String removeParentheses(final String str) {
        Stack<Character> chars = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (Character c : str.toCharArray()){
            if(c == '('){
                chars.add(')');
            }else if(c == ')'){
                if(chars.peek() == ')') chars.pop();
            }else{
                if(chars.isEmpty()) result.append(c);
            }
        }
        return result.toString();
    }
}
