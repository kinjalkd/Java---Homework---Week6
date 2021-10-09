package homework;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
    Question7 t = new Question7();
    t.input();

    }

    public void input(){
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        System.out.println("Enter the degree in Farenheit:  ");
        f = input.nextDouble();
        c = ((f-32)*5/9);
        System.out.println("The temperature in Celsius is:" + c +" c");

    }

}
