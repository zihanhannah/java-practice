import java.util.Scanner;
//Sample Input 0
//
//welcometojava
//3
//Sample Output 0
//
//ava
//wel
public class SubStringAndLexicographicalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scanner.nextLine();
        System.out.println("enter a number(smaller than the String Length)");
        int n = scanner.nextInt();
        String smallest = s.substring(0,n);
        String largest = s.substring(0,n);
        for(int i = 1; i < s.length()-n+1; i++){
            String s2 =s.substring(i,i+n);
            if(largest.compareTo(s2) < 0){
                largest = s2;
            }else if(smallest.compareTo(s2) > 0){
                smallest = s2;
            }
        }
        System.out.println(smallest + "\n" + largest);
    }
}
