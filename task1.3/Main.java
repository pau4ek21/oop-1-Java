// Pet class
public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Kitty", "Cat");
        Person person = new Person("John", 30, cat);

        person.callPet("kis-kis");
    }
}
