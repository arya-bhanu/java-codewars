package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kata
{
    public static int[] arrayDiff(int[] a, int[] b) {
        if(b.length == 0 ) return a;
        ArrayList<Integer> newArr = new ArrayList<>();
        Map<Integer, Integer> mapCheckr = new HashMap<>();

        for (int valB : b){
            mapCheckr.put(valB, valB);
        }

        for(int valA: a){
            if(mapCheckr.get(valA) == null){
                newArr.add(valA);
            }
        }
        int [] returnArr = new int[newArr.size()];
        for (int i = 0; i < newArr.size(); i++) {
            returnArr[i] = newArr.get(i);
        }
        // Your code here
        return returnArr;
    }
}