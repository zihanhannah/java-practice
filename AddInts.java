import java.util.Scanner;

/**
 * Write a method to add to integers (int) and return the sum.
 *
 * LEVEL: BASIC
 *
 * @param a     First number to add
 * @param b     Second number to add
 * @return      The sum
 */
public class AddInts {
    public static int addInt(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the first number");
        int a = sc.nextInt();
        System.out.println("the second number");
        int b = sc.nextInt();
        System.out.println(addInt(a,b));
    }
}
