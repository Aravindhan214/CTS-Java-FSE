import java.util.*;
class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);
    }
}
