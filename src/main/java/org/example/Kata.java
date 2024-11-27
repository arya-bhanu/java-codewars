package org.example;

public class Kata {
    public static int[] invert(int[] array) {
        int[] newArr = new int[array.length];
        int i = 0;
        for(int val : array){
            newArr[i] = val * -1;
            i++;
        }
        return newArr;
    }
}
