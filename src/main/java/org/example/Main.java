package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] a = new int[]{1,3, 5 ,10, 21,1,1,1,10};
        int [] b = new int[] {1};
        IntStream newStream = IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x));
        System.out.println(Arrays.toString(newStream.toArray()));
    }

}