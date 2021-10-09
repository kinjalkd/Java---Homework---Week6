package homework;

//Write a Java program to swap two variables.

public class Question15 {

    public static void main(String[] args) {
        Question15 t = new Question15();
        t.swap();
    }

    public void swap() {
        int a = 15;
        int b = 20;
        int c;
        System.out.println("Before swapping : a, b = " + a + " , " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping : a, b = " + a + " , " + b);
    }
}