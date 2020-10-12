import java.lang.reflect.Array;
import java.util.Scanner;

//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) {
            System.out.println(0);
        } else {
            String s = scanner.nextLine();
            String[] sArray = s.trim().split("[ !,?._'@]+");
            int l = sArray.length;
            System.out.println(l);
            for (String item : sArray) {
                System.out.println(item);
            }
        }
    }

}
