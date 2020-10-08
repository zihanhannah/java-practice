import java.util.Scanner;

public class ScannerSwitchDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a integer: ");
        int i = scan.nextInt();
        System.out.println("enter a double: ");
        double d = scan.nextDouble();
        //        !!!! switch the data type from number to String

        scan.nextLine();

        System.out.println("enter a String: ");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
