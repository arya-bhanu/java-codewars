package org.example;

public class Solution
{
    public static int[] rowWeights (final int[] weights)
    {
        int tim1 = 0;
        int tim2 = 0;
        for (int i = 0; i < weights.length; i++){
            if((i + 1) % 2 == 0){
                tim2 += weights[i];
            }else{
                tim1 += weights[i];
            }
        }
        return  new int[]{tim1, tim2};
    }
}