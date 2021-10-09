package homework;

public class Question4 {

    String Name = "Kinjal"; //instance variable
    String Surname = "Doshi"; //instance variable
    static boolean a = true; //static variable
    static boolean b = false; //static variable

    public void library (){ //instance method
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Question4.a);
        System.out.println(Question4.b);
    }

    public static void school (){ //static method
       Question4 t = new Question4();
        System.out.println(t.Name);
        System.out.println(t.Surname);
        System.out.println(a);
        System.out.println(b);


    }

    public static void main(String[] args) { //Static Method
        Question4 s = new Question4();
        s.library();
        school();
    }
}
