import java.util.Scanner;

/**
 * Exercise 005 - Concatenate strings
 * Write a method to join to Strings together with a space between the two Strings.
 *
 * LEVEL: BASIC
 *
 *  a     First String
 *  b     Second String
 * @return      The joined strings
 */
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first  String");
        String a = sc.nextLine();
        System.out.println("enter second String");
        String b = sc.nextLine();
        System.out.println(a +" " + b);
    }
}
