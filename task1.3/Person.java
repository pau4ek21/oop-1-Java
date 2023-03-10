// Person class
public class Person {
    private String name;
    private int age;
    private Pet pet;

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Other methods

    public void callPet(String call) {
        System.out.println(name + " calls \"" + call + "\" to " + pet.getName() + ".");
        pet.respondToCall(call);
    }
}
