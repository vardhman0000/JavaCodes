package Basics;

import java.util.Scanner;

public class Bitwise_Operators {
    static void oddEven(int num){
        if((num & 1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    static void checkSecondBit(int num){
        num = num >> 1;
        if((num & 1) == 1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

    static void setSecondBit(int num){
//        int num1 = num;
//        num = num >> 1;
//        if((num & 1) == 1){ // second bit is 1 -> Toh kuch ni krna
//            System.out.println("Second Bit is Already 1 : " + num1);
//        }
//        else{
//            int mask = 1 << 1; // 1 -> 10
//            num = num | mask;
//            System.out.println("Changed the Second Bit : " + num);
//        }

        // Method 2
        System.out.println( num | (1<<1) );
    }

    static void setithBit(){ // XOR it with mask
        int num;
        int i;
        // 1 0 1
        // 0 0 0

        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        System.out.print("Enter Index : ");
        i = scan.nextInt();

        int mask = 1 << i;
        System.out.println( num & mask );

    }

    static void powerOfTwo(int num){
        if(((num) & (num-1)) == 0){
            System.out.println("Yes!!");
        }
        else{
            System.out.println("No!!");
        }
    }

    static void swapNum(int a, int b){

        System.out.print("Before Swapping : ");
        System.out.print(a + " ");
        System.out.println(b);

        a = a^b;
        b = b^a;
        a = a^b;

        System.out.print("After Swapping num : ");
        System.out.print(a + " ");
        System.out.println(b);
    }

    public static void main(String[] args) {
//        int num1 = 2;
//        int num2 = 3;
//
//        System.out.println(num1 & num2);
//        System.out.println(num1 | num2);
//        System.out.println(num1 ^ num2);


        oddEven(3);

        checkSecondBit(1); // 2nd bit is 0
        checkSecondBit(7); // 2nd bit is 1

        setSecondBit(5);

        setithBit();

        powerOfTwo(4);

        swapNum(10,20);

        /*

        0 0 0 0 0 0 1 1
        ^             ^
       MSB           LSB
        |- 0 -> POSITIVE NUMBER
        |- 1 -> NEGATIVE NUMBER

        */
    }
}
