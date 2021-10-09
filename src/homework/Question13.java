package homework;

/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        int average = (x + y + z)/3;
        System.out.print("The average value is " + average);
    }

}
