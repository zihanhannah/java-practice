import java.util.Scanner;

/**
 * Exercise 004 - Add doubles
 * Write a method to add to real numbers (double) and return the sum as a double.
 *
 * LEVEL: BASIC
 *
 * a    First number to add
 * b     Second number to add
 * @return      The sum
 */
public class AddDouble {
    public static double addDouble(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first double number");
        double a = sc.nextDouble();
        System.out.println("enter second double number");
        double b = sc.nextDouble();
        System.out.println(addDouble(a,b));
    }
}
