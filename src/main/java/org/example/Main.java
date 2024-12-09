package org.example;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        long a = 9L;
        long b = 4L;
        Map<Integer, Integer> map = new HashMap<>();
        Integer res = map.put(1,100);
        Integer res2 = map.put(2,200);
        Integer res3 = map.put(1,1000);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(map.get(1));
     /*   System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));*/
    }

}