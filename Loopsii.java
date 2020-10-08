import java.util.Scanner;

public class Loopsii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        t is like how many set of the number you want to take
        int t= scan.nextInt();
        for(int i = 0 ; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = a;
            for(int j = 0 ; j < n ; j++){
                sum += Math.pow(2,j) * b;
                System.out.print(sum + " ");
            }
            System.out.println(" ");
        }
    }
}
