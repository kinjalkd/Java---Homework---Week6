package homework;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Question16 {
    public static void main(String[] args) {
        Question16 n = new Question16();
        n.binaryaddition();

    }

    public void binaryaddition() {
        long b1, b2;
        int i = 0;
        int carry = 0;

        int[] sum = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        b1 = scanner.nextLong();

        System.out.print("Enter second binary number: ");
        b2 = scanner.nextLong();

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }


}




