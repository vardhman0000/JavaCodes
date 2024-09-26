package Strings;

import java.util.*;

public class Capitalize_first_letter_of_each_word {
    public static void main(String[] args) {
        String s = "this is a sentence";
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder result = new StringBuilder();

        while(st.hasMoreTokens()){
            String word = st.nextToken();

            String capitalize = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(capitalize).append(" ");
        }
        System.out.print(result.toString().trim());
    }
}