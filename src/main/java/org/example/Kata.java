package org.example;

public class Kata
{
    public static boolean interlockable(long a, long b) {
        String binA = Long.toBinaryString(a);
        String binB = Long.toBinaryString(b);
        long lastIndexA = binA.length() - 1;
        long lastIndexB = binB.length() -  1;
        while (lastIndexA >= 0 && lastIndexB >= 0){
            if((binA.charAt((int)lastIndexA) == '1' &&  binB.charAt((int) lastIndexB) == '1')){
                return false;
            }
            --lastIndexB;
            --lastIndexA;
        }

        return true;
    }
}