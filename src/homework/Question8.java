package homework;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        example();
    }

    public static void example(){
        Scanner area = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle: ");
        int length = area.nextInt();
        System.out.println("Please enter the height of the triangle: ");
        int height = area.nextInt();
        int areaoftriangle = (length*height)/2;

        System.out.println("Area of a triangle is " + areaoftriangle);

    }
}
