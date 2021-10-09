package homework;

import java.sql.SQLOutput;

public class Question3 {

    String name = "Kinjal"; //instance variable
    static String surname = "Doshi"; //static variable

    public static void main(String[] args) {
        Question3 a = new Question3();
        a.program1();
        program2();

    }

    public void program1 (){ //instance method
        System.out.println(name);
        System.out.println(Question3.surname);
    }

    public static void program2 (){ //static method
        Question3 t = new Question3();
        System.out.println(t.name);
        System.out.println(surname);
    }
}
