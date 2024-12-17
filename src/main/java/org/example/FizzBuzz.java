package org.example;

public class FizzBuzz {
    public static int[] solution(int number) {
        /*cara 1*/
       /* int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 1; i < number; i++) {
            if(i % 3 == 0 && i % 5 != 0){
                ++A;
            }else if(i % 3 != 0 && i % 5 == 0){
                ++B;
            }else if(i % 3 == 0 && i % 5 == 0){
                ++C;
            }
        }
       return  new int[] {A,B,C};*/

        /*cara 2 using kpk*/
        /*kpk digunakan untuk mencari bilangan yang menjadi kelipatan untuk 3 dan 5*/
        /*untuk kasus A, maka kita dapat membagi bilangan number dibulatkan terkecil, tapi dikurangi dengan kasus bilngan yang menjadi kelipata 3 & 5*/
        /*untuk kasus B, maka kita dapat membagi bilangan number dibulatkan terkecil, tapi dikurangi dengan kasus bilngan yang menjadi kelipata 3 & 5*/
        --number;
        int A = number / 3;
        int B = number / 5;
        int C = number / 15;
        return  new int[] {A - C, B - C, C};
    }
}
