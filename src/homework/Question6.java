package homework;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double r = s.nextDouble();
        double pi = 22.14f;
        double area = (pi * r * r);
        System.out.println("Area of Circle is:" + area);

    }
}
