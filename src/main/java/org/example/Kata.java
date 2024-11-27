package org.example;

public class Kata {
    public static String generateShape(int n) {
       StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append("+".repeat(n));
            if(i < n - 1){
                result.append("\n");
            }
        }
        return result.toString();
    }
}
