package ua.ithillel.lms;

public class Cat extends Animal {

    private String name;
    private String breed;
    private int age;
    private static int count;


    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        count++;
    }

    @Override
    public void run(int a) {
        if (a > 200) {
            System.out.println(getName() + " can't run!!");
        } else
            System.out.println(getName() + " runs " + a + "m.");
    }

    @Override
    public String toString() {
        return "Cat{" +
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
