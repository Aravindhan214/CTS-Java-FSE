import java.util.*;
class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number 1: ");
            int num = sc.nextInt();
            System.out.print("Enter a number 2: ");
            int num1 = sc.nextInt();

            int res = num / num1;
            System.out.println("Result is: " + res);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException: " + e.getMessage());
        }
    }
}
