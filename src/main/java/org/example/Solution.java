package org.example;

public class Solution {
    public static String findSquares(int n){
        /* a^2 - b^2 = n*/
        /* kita assume jika selihsih bilangan bulat terkecil yang mungkin a - b = 1*/
        /* Subsitusi untuk menghilangkan salah satu variabel */
        /* (b + 1)^2 - b^2 = n */
        /* b^2 + 2b + 1 - b^2 = n */
        /* b = n-1 / 2 */
        long b = (n - 1) / 2;
        long a = b + 1;
        return String.format("%d-%d", a * a,b * b);
    }
}
