package org.example;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        // your code here
        int a= 0;
        int b = 1;
        int max = -1;
        while (b != array.length){
            int multiply = array[a] * array[b];
            if(a == 0 && b == 1){
                max = multiply;
            }else{
                if(multiply > max){
                    max = multiply;
                }
            }
            ++a;
            ++b;
        }
        return max;
    }
}