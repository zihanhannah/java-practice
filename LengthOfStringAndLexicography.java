import java.util.Scanner;
//Given two strings of lowercase English letters,  and , perform the following operations:
//Sum the lengths of  and .
//Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in  and  and print them on a single line, separated by a space.
public class LengthOfStringAndLexicography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        long sum = A.length() + B.length();
        System.out.println(sum);
//if (string1 > string2) it returns a positive value.
//if both the strings are equal lexicographically
//i.e.(string1 == string2) it returns 0.
//if (string1 < string2) it returns a negative value.
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String stringConcat = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(stringConcat);
    }
}
