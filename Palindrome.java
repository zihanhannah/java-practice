import java.util.Scanner;
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
//eg:  madam
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" will consist at most 50 lower case english letters.");
        String s = scanner.nextLine();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)){
                System.out.println("No");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("Yes");
    }
}
