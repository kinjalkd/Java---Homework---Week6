package homework;

import java.util.Locale;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Question9 t = new Question9();
        t.changecase();
    }

    public void changecase() {
        String uppercase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase alphabets: ");
        uppercase = sc.nextLine();
        String uppercase2 = uppercase.toLowerCase();
        System.out.println("The Lowercase alphabets are = " + uppercase2);
    }


}
