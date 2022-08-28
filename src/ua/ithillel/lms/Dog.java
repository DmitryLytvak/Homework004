package ua.ithillel.lms;

public class Dog extends Animal {

    private static int count;

    public Dog(String kind, String subspecies, String animalName,
               String name, String breed, int age) {
        super(kind, subspecies, animalName, name, breed, age);
        count++;
    }

    @Override
    public void run(int a) {
        if (a >= 500) {
            System.out.println(getName() + " can't run!!");
        } else
            System.out.println(getName() + " runs " + a + "m.");

    }

    @Override
    public void swim(int b) {
        if (b >= 10) {
            System.out.println(getName() + " can't swim!!");
        } else
            System.out.println(getName() + " swims " + b + "m.");
    }

    public static int getCount() {
        return count;
    }
}
