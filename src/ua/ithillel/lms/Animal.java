package ua.ithillel.lms;

public class Animal {

    private String kind;
    private String subspecies;
    private String animalName;

    public Animal(String kind, String subspecies, String animalName) {
        this.kind = kind;
        this.subspecies = subspecies;
        this.animalName = animalName;
    }

    public void voice() {
    }

    public void eat() {
    }

    public void sleep() {
    }

    public void swim(int swim) {
    }

    public void run(int run) {
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

}
