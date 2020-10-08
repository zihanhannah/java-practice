import java.util.Scanner;

public class FormatingOutput {
    public static void main(String[] args) {
        String[] s = {"Hello","Codeup","!"};
        Integer[] x = {1,2,3};
        System.out.println("================================");
        for(int i=0 ; i < 3; i++){
            System.out.printf("%-15s%03d%n",s[i],x[i]);
        }
        System.out.println("================================");
    }
}
