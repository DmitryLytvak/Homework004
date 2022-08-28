package ua.ithillel.lms;

public class Animal {

    private String kind;
    private String subspecies;
    private String animalName;
    private String name;
    private String breed;
    private int age;

    public Animal(String kind, String subspecies, String animalName, String name, String breed, int age) {
        this.kind = kind;
        this.subspecies = subspecies;
        this.animalName = animalName;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // создал конструктор без полей, для возможного дальнейшего использования класс Animal,
// в случаях, когда поля не будут необходимы.
    public Animal() {
    }

    public void voice() {
    }

    public void eat() {
    }

    public void sleep() {
    }

    public void swim(int a) {
    }

    public void run(int b) {
    }

    //с переопределением метода toString была заминка, единственное где его можно было
    //переопределить, чтобы в Main выводилось на экран информация в читабельном виде.
    @Override
    public java.lang.String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", subspecies='" + subspecies + '\'' +
                ", animalName='" + animalName + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
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
