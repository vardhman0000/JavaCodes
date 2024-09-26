package Strings;

import java.util.*;

public class Swap_first_and_last_char_of_each_word {
    public static void main(String [] args){
        String s = "This is a Sentence";
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder result = new StringBuilder();

        while (st.hasMoreTokens()){
            StringBuilder word  = new StringBuilder(st.nextToken());
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            word.setCharAt(0, last);
            word.setCharAt(word.length()-1, first);

            result.append(word).append(" ");
        }

        System.out.print(result);
    }
}

