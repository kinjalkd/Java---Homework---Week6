package homework;

/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

public class Question11 {

    public static void main(String[] args) {
        Question11 t = new Question11();
        t.java();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        java2();

        }
    public void java(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void java2(){
        System.out.println("J   a v   v  a ");
        System.out.println("J  a a  v v  a a");
        System.out.println("J J  aaaaa   V V  aaaaa");
        System.out.println("J J  a   a  V  a    a");
    }
}
