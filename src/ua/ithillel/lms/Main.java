package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog("Bobby", "poodle", 2);
        System.out.println(dog);
        dog.run(200);
        System.out.println();


        Cat cat = new Cat("Barsik", "Maine Coon", 1);
        System.out.println(cat);
        cat.run(150);
        System.out.println();


        Dog doggie = new Dog("Rex", "Irish Wolfhound", 4);
        System.out.println(doggie);
        doggie.swim(9);
        System.out.println();


        System.out.println("Created by animals - " + (Dog.getCount() + Cat.getCount()));

    }
}
