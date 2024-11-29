package org.example;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String alphabetWar(String fight){
        Map<String, Integer> left = new HashMap<>();
        Map<String, Integer> right = new HashMap<>();



        left.put("w",4);
        left.put("p", 3);
        left.put("b",2);
        left.put("s",1);

        right.put("m",4);
        right.put("q",3);
        right.put("d",2);
        right.put("z",1);

        int countLeft = 0;
        int countRight = 0;

        for(int i = 0; i < fight.length(); i++){
            Integer curLeft = left.get(Character.toString(fight.charAt(i)));
            if(curLeft != null){
                countLeft += curLeft;
            }else{
                Integer curRight = right.get(Character.toString(fight.charAt(i)));
                if(curRight != null){
                    countRight += curRight;
                }
            }
        }

        if (countRight > countLeft){
            return "Right side wins!";
        }else if(countRight < countLeft){
            return "Left side wins!";
        }
        return "Let's fight again!";

    }
}
