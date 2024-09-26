package Strings;

import java.util.*;

public class StrBuilder {
    public static void main(String[] args) {
        String s = "Vardhman Jain";
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            System.out.println(ch);
        }
    }
}
