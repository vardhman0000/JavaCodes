package Basics;

public class Pass_Fail {
    public static void main (String[] args){
        int marks = 30;

        if(marks >= 70) System.out.println("First");
        else if (marks >= 50) System.out.println("Second");
        else if (marks >= 30) System.out.println("Third");
        else System.out.println("Fail");
    }
}
