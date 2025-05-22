import java.util.*;
class Car{
    String color;
    String model;
    int year;
    Car(String color, String model, int year){
    this.color = color;
    this.model = model;
    this.year = year;
    }
    void displayDetails(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }        
}
class ClassObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model=sc.nextLine();
        String color=sc.nextLine();
        int year=sc.nextInt();

        Car c=new Car(model, color, year);
        c.displayDetails();
    }
}
