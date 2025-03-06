package Interfaces;

public class Test{
    public static void main(String args[]){
        Dog dog=new Dog();
        dog.eat();
        System.out.println(dog.max);
        System.out.println(Animal.max);
        Animal.info();
    }
}
