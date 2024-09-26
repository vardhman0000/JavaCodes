package Strings;

import java.util.*;

public class BalancedBrackets {

    static int balancedString(String s){
        // Write your code here
        Stack <Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            // Push Opening Brackets
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }

            // Handle Closing Brackets
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                // If stack Empty
                if(st.isEmpty()){
                    return i;
                }
                // Check for top of stack
                if(st.peek() == '(' && s.charAt(i) == ')' ||
                    st.peek() == '{' && s.charAt(i) == '}' ||
                    st.peek() == '[' && s.charAt(i) == ']'
                ){
                    st.pop();
                }
                else{
                    return i;
                }
            }
        }

        // Still Stack not Empty
        if(!st.isEmpty()){
            return s.length();
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "if(a(4)>9){foo(a(2));}";
        System.out.println(balancedString(s));
    }
}
