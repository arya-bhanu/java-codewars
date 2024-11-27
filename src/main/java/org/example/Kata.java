package org.example;

public class Kata {
    public static boolean solution(String str, String ending) {
        if(ending.length() > str.length()) return false;
        int counter = 0;
        for(int i = ending.length() - 1; i >= 0; i--){
            char c = str.charAt(str.length() - 1 - counter);
            if(c != ending.charAt(i)){
                return false;
            }
            counter++;
        }
        return true;
    }
}
