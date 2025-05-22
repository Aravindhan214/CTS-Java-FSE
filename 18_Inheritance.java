import java.util.*;
class Animal{
    public void makeSound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Inheritance {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        System.out.print("Dog sound: ");
        myDog.makeSound(); 
    }
}
