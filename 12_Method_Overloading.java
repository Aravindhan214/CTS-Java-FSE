import java.util.*;
class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverloading mo = new MethodOverloading();
        System.out.print("Enter two integers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter two doubles: ");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println("Sum of integers: " + mo.add(a, b));
        System.out.println("Sum of doubles: " + mo.add(c,d));
    }
}
