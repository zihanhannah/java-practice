import java.util.Scanner;

public class LoopEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<=10; i++){
            System.out.println( N + " x " + i + " = " + N*i);
        }
        scanner.close();
    }
}
