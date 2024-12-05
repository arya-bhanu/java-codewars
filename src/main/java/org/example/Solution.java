package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
          Integer tmp = target - numbers[i];
          if(map.containsKey(tmp)){
              return new int[] {map.get(tmp), i};
          }
          map.put(numbers[i],i);
        }

        return new int[]{};

        /*BRUTE FORCE*/
        /*int indexA = 0;
        int indexB = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i]);
                System.out.println(numbers[j]);
                if(numbers[i] + numbers[j] == target){
                    indexA = i;
                    indexB = j;
                }
            }
        }
        return new int[] {indexA, indexB}; */
    }
}
