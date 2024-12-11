package org.example;

import java.util.stream.IntStream;

public class Solution
{

    public static int findMissing(int[] numbers)
    {
        /*Formula*/
        /* Sn = n/2 * (a + un) */
        int totalLength = numbers.length + 1;
        int currTotal = IntStream.of(numbers).sum();
        int shouldTotal = (numbers[0] + numbers[numbers.length - 1]) * totalLength/2;
        int shouldTotal2 = totalLength/2 * (numbers[0] + numbers[numbers.length - 1]) ;
        System.out.println(shouldTotal2);
        System.out.println(shouldTotal);
        return shouldTotal - currTotal;
    }
}