package org.example;

public class Factorial {
    public static long factorial(int n) {
        if(n == 0) return 1L;
        if(n == 1) return n;
        return n * factorial(n-1);
    }
}
