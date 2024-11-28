package org.example;

public class Pronic {
    public static boolean isPronic(int n) {
        if(n == 0) return true;
        int flored = (int) Math.floor(Math.sqrt(n));
        int next = flored + 1;
        return (flored * next == n);
    }
}
