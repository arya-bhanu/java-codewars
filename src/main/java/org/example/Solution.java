package org.example;

public class Solution
{
    public static String autoMorphic(int number)
    {
       int result = number * number;
       String numString = Integer.toString(number);
       String resString = Integer.toString(result);
       return resString.endsWith(numString) ? "Automorphic" : "Not!!";
    }
}