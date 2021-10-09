package homework;

/*Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;


public class Question19 {

    public static void main(String[] args) {
        Question19 t = new Question19();
        t.changecase();
    }

    public void changecase() {
        String uppercase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        uppercase = sc.nextLine();
        String uppercase2 = uppercase.toLowerCase();
        System.out.println("The Lowercase of the above example is = " + uppercase2);
    }
}
