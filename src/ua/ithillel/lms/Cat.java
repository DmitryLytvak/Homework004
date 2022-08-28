package ua.ithillel.lms;

public class Cat extends Animal {

    private static int count;

    public Cat(String kind, String subspecies, String animalName, String name,
               String breed, int age) {
        super(kind, subspecies, animalName, name, breed, age);
        count++;
    }


    @Override
    public void run(int a) {
        if (a >= 200) {
            System.out.println(getName() + " can't run!!");
        } else
            System.out.println(getName() + " runs " + a + "m.");
    }

    public static int getCount() {
        return count;
    }

}
