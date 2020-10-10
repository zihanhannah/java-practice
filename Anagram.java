import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first string");
        String s1 = scanner.nextLine();
        System.out.println("enter the second string");
        String s2 = scanner.nextLine();
        char[] s1Char = s1.toUpperCase().toCharArray();
        Arrays.sort(s1Char);
        char[] s2Char = s2.toUpperCase().toCharArray();
        Arrays.sort(s2Char);
        if(Arrays.equals(s1Char,s2Char)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }
}
