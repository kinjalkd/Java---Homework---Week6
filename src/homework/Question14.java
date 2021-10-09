package homework;

/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
        perimeter();

    }

    public static void perimeter() {

        Scanner p = new Scanner(System.in);
        System.out.print("Input the width of the rectangle: ");
        int x = p.nextInt();
        System.out.print("Input the height of the rectangle: ");
        int y = p.nextInt();
        int perimeter = (2 * x + 2 * y);
        System.out.print("The perimeter of the rectangle is: " + perimeter);


    }
}

