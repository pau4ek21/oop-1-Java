public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 30, 180);
        Cabinet cabinet = new Cabinet(100, 200, 50);
        cabinet.setPerson(person);

        System.out.println("Cabinet dimensions: " + cabinet.getWidth() + "x" + cabinet.getHeight() + "x" + cabinet.getDepth());
        System.out.println("Person name: " + cabinet.getPerson().getName());
        System.out.println("Person age: " + cabinet.getPerson().getAge());
        System.out.println("Person height: " + cabinet.getPerson().getHeight());
    }
}

class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Cabinet {
    private int width;
    private int height;
    private int depth;
    private Person person;

    public Cabinet(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.person = null;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}