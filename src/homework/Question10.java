package homework;

import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

public class Question10 {
    public static void main(String[] args) {

        multiplication();
    }

    public static void multiplication (){

        int i = 8;
        System.out.println(i + " x " + 1 + " = " + (i * 1));
        System.out.println(i + " x " + 2 + " = " + (i * 2));
        System.out.println(i + " x " + 3 + " = " + (i * 3));
        System.out.println(i + " x " + 4 + " = " + (i * 4));
        System.out.println(i + " x " + 5 + " = " + (i * 5));
        System.out.println(i + " x " + 6 + " = " + (i * 6));
        System.out.println(i + " x " + 7 + " = " + (i * 7));
        System.out.println(i + " x " + 8 + " = " + (i * 8));
        System.out.println(i + " x " + 9 + " = " + (i * 9));
        System.out.println(i + " x " + 10 + " = " + (i * 10));

    }
}
