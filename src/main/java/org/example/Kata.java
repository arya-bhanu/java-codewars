package org.example;

import java.util.Stack;

public class Kata {
    public static String removeParentheses(final String str) {

        /*use regex instead*/
        String updated = str.replaceAll("\\([^()]*\\)", "");
        if(updated.contains("(")) return removeParentheses(updated);
        return updated;

       /* Stack<Character> chars = new Stack<>();
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
        return result.toString();*/
    }
}
