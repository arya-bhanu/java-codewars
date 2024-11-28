package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPronic(42));
        System.out.println("Hello world!");
    }

    public static boolean isPronic(int n) {
        if(n == 0) return true;
        int flored = (int) Math.floor(Math.sqrt(n));
        int next = flored + 1;
        return (flored * next == n);
    }
}