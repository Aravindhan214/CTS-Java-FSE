import java.util.*;
class Fibonacci{
    public static int fibo(int n){
        if(n<=1){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int res6 = fibo(num);
        System.out.print("Fibonacci number is : "+res);
    }
}
