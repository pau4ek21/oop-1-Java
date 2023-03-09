public class GenealogicalTreeApp {
    public static void main(String[] args) {

        Person person1 = new Person("John Smith", 35);
        Person person2 = new Person("Mary Johnson", 33);
        Person person3 = new Person("Mike Smith", 10);
        Person person4 = new Person("Alice Smith", 5);


        GenealogicalTree tree = new GenealogicalTree();
        tree.addPerson(person1);
        tree.addPerson(person2);
        tree.addPerson(person3);
        tree.addPerson(person4);
        tree.addRelationship(person1, person3, "parent");
        tree.addRelationship(person1, person4, "parent");
        tree.addRelationship(person2, person3, "parent");
        tree.addRelationship(person2, person4, "parent");


        ResearchComponent researchComponent = new ResearchComponent(tree);
        researchComponent.printChildren(person1);
        researchComponent.printChildren(person2);
    }
}
