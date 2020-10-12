import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exercise 012 - Find Factors
 * Find all of the factors for a given positive integer (int). The result needs to be sorted in ascending order.
 *
 * LEVEL: EASY
 *
 *  num       The number to be factored
 * @return          An Integer ArrayList of factors of num.
 */
public class FindFactorsOftheNumber {
    public static List<Integer> findFactorsOftheNumber(int num){
        List<Integer> numberArray = new ArrayList<Integer>();
        for(int i = 1 ; i <= num; i++){
            if(num % i ==0){
                numberArray.add(i);
            }
        }
        return numberArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer");
        int num = sc.nextInt();
        System.out.println(findFactorsOftheNumber(num));
    }
}
