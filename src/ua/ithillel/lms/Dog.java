package ua.ithillel.lms;

public class Dog extends Animal {

    private String name;
    private String breed;
    private int age;
    private static int count;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        count++;
    }

    @Override
    public void run(int a) {
        if (a > 500) {
            System.out.println(getName() + " can't run!!");
        } else
            System.out.println(getName() + " runs " + a + "m.");

    }

    @Override
    public void swim(int b) {
        if (b > 10) {
            System.out.println(getName() + " can't swim!!");
        } else
            System.out.println(getName() + " swims " + b + "m.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
