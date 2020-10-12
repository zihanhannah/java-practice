import java.util.Scanner;

/**
 * Write a method with 3 parameters; a String and 2 doubles. The string will be an operation that the operation
 * needs to process on the two operands. Return the result if the operation. Return 0.0 if the operation is not
 * one of the four specified. The operation should be case sensitive.
 *
 * LEVEL: EASY
 *
 *  operation     ADD, SUB, MUL, DIV
 *  op1           First operand
 *  op2           Second operand
 * return              Result
 */
public class PreformIndicatedOperation {
   public static double preformIndicatedOperation(String s, double a, double b){
        if(s.equals("ADD")){
            return a + b;
        } else if(s.equals("SUB")){
            return a - b;
        } else if(s.equals("MUL")){
            return a * b;
        } else if(s.equals("DIV")){
            return a / b;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operation ");
        String s = sc.nextLine();
        System.out.println("enter the first double number ");
        double a = sc.nextDouble();
        System.out.println("enter the second double number ");
        double b = sc.nextDouble();
        System.out.println(preformIndicatedOperation(s,a,b));
    }
}
