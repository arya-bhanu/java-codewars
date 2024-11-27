package org.example;

public class Kata {
    public static String well(String[] x) {
        int countGood = 0;
        for (String s : x){
            if(s.equals("good")){
                countGood++;
            }
        }
        return  countGood == 0 ? "Fail!" : countGood <= 2 ? "Publish!" : "I smell a series!";
    }
}
