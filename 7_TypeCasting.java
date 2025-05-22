import java.util.*;
class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        double b = a;
        System.out.print("Double value: ");
        double c=sc.nextDouble();
        int d = (int)c;
        System.out.println("Integer value: " + a);
        System.out.println("Converted to double: " + b);
        System.out.println("Double value: " +c);
        System.out.println("Converted to Integer: " + d);
    }
}
