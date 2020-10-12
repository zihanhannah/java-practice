import java.util.Scanner;

/**
 * Exercise 002 - Say Hello
 *
 * Given an input String, name; return a String with "Hello " appended in-front of name and "!" appended after name.
 *
 * LEVEL: BASIC
 *
 * @param name  A name
 * @return      A greeting.
 */
public class SayHello {
    public static String sayHello(String name){
        return "Hello " + name + "!";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();
        System.out.println(sayHello(name));
    }
}
