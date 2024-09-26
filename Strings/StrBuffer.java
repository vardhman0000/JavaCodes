package Strings;

import java.util.*;

public class StrBuffer {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
        }
        System.out.print(sb);
    }
}
