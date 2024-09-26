package Strings;

import java.util.*;

public class StrTokenizer {
    public static void main(String args[]){
        String s = "I am Vardhman Jain and I am one of the best Ethical Hackers";
        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken() + " ");
        }
    }
}
