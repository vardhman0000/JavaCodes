package Strings;

import java.util.*;

public class Find_occurrences_of_palindrome_words_in_a_string {
    public static void main(String [] args){
        String s = "I have a racecar";
        StringTokenizer st = new StringTokenizer(s);
        int count = 0 ;
        Boolean flag = true;

        while(st.hasMoreTokens()){
            String word = st.nextToken();

            for(int i=0; i<word.length(); i++){
                if(word.charAt(i) == word.charAt(word.length()-1-i)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(word);
                count++;
            }
        }

        System.out.print("Total Palindromes : " + count);
    }
}
