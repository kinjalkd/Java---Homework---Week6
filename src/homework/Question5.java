package homework;

public class Question5 {

    public static void main(String[] args) { //static main method

        addition(25, 30);
        System.out.println("1. The sum of 25 and 30 is "+ addition(25,30));

        subtraction(100,50);
        System.out.println("2. When 50 is subtracted from 100 the answer is " + subtraction(100, 50));

        Question5 obj = new Question5();
        int answer3 = obj.multiplication(10,20);
        System.out.println("3. The product of 10 and 20 is " + (answer3)); //200

        int answer4 = obj.division(10,5);
        System.out.println("4. When 10 is divided by 5 the answer is " + (answer4));//2


    }

    public static int addition(int a, int b) { //static method Return Type with Parameters
        int result = a + b;
        return result;



    }

    public static int subtraction(int c, int d) { //static method
        int result2 = c - d;
        return result2;

    }

    public int multiplication(int e, int f) { //instance method
        int result3 = e * f;
        return result3;

    }

    public int division(int g, int h) { //instance method
        int result4 = g/h;
        return result4;


    }
}
