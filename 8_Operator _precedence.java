import java.util.*;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

       
        int result1 = a + b * c;     
        int result2 = (a + b) * c;     
   
        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);

        scanner.close();
    }
}
/* 
*, /, and % have higher priority (higher precedence).

+ and - come at the next level (lower precedence than multiplication and division).

Parentheses () have the highest priority of all.

So, by using parentheses, you can control the order in which operations are evaluated in an expression.

*/
