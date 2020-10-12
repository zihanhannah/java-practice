import java.util.Scanner;
import java.util.regex.Pattern;

//Pattern.compile
//input:
//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat

//output:
//Valid
//Invalid
//Invalid
public class StringPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases>0){
            try {
                String pattern = scan.nextLine();
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }


}
