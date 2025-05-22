import java.util.*;
class Alist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter the number of names you want to add: ");
        int n=sc.nextInt();
        System.out.println("Enter the names: ");
        for(int i=0;i<=n;i++){
            String name=sc.nextLine();
            list.add(name);
        }
        System.out.println("The names in the list are: ");
        for(String name : list){
            System.out.print(name+" ");
        }
    }
}
