package org.example;

import java.util.stream.IntStream;

public class Kata
{

    public static int missingNo(int[] nums) {
        int sumAll = IntStream.of(nums).sum();
        return (101 * 50) - sumAll;
    }
}