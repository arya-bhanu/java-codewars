package org.example;


public class Letters {
    public static String search(String line){

        char [] chars = new char[26];
        for (int i = 0; i < 26; i++) {
            chars[i] = '0';
        }

        if(line.contains("a") || line.contains("A")){
            chars[0] = '1';
        }
        if(line.contains("b") || line.contains("B")){
            chars[1] = '1';
        }
        if(line.contains("c") || line.contains("C")){
            chars[2] = '1';
        }
        if(line.contains("d") || line.contains("D")){
            chars[3] = '1';
        }
        if(line.contains("e") || line.contains("E")){
            chars[4] = '1';
        }
        if(line.contains("f") || line.contains("F")){
            chars[5] = '1';
        }
        if(line.contains("g") || line.contains("G")){
            chars[6] = '1';
        }
        if(line.contains("h") || line.contains("H")){
            chars[7] = '1';
        }
        if(line.contains("i") || line.contains("I")){
            chars[8] = '1';
        }
        if(line.contains("j") || line.contains("J")){
            chars[9] = '1';
        }
        if(line.contains("k") || line.contains("K")){
            chars[10] = '1';
        }
        if(line.contains("l") || line.contains("L")){
            chars[11] = '1';
        }
        if(line.contains("m") || line.contains("M")){
            chars[12] = '1';
        }
        if(line.contains("n") || line.contains("N")){
            chars[13] = '1';
        }
        if(line.contains("o") || line.contains("O")){
            chars[14] = '1';
        }
        if(line.contains("p") || line.contains("P")){
            chars[15] = '1';
        }
        if(line.contains("q") || line.contains("Q")){
            chars[16] = '1';
        }
        if(line.contains("r") || line.contains("R")){
            chars[17] = '1';
        }
        if(line.contains("s") || line.contains("S")){
            chars[18] = '1';
        }
        if(line.contains("t") || line.contains("T")){
            chars[19] = '1';
        }
        if(line.contains("u") || line.contains("U")){
            chars[20] = '1';
        }
        if(line.contains("v") || line.contains("V")){
            chars[21] = '1';
        }
        if(line.contains("w") || line.contains("W")){
            chars[22] = '1';
        }
        if(line.contains("x") || line.contains("X")){
            chars[23] = '1';
        }
        if(line.contains("y") || line.contains("Y")){
            chars[24] = '1';
        }
        if(line.contains("z") || line.contains("Z")){
            chars[25] = '1';
        }
        StringBuilder sb = new StringBuilder();

        for (char c : chars){
            sb.append(c);
        }


        return sb.toString();
    }
}
