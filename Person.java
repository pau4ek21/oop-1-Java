import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ", age " + age;
    }
}

class Relationship {
    private Person person1;
    private Person person2;
    private String relationshipType;

    public Relationship(Person person1, Person person2, String relationshipType) {
        this.person1 = person1;
        this.person2 = person2;
        this.relationshipType = relationshipType;
    }

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public String toString() {
        return person1.getName() + " is " + relationshipType + " of " + person2.getName();
    }
}

class GenealogicalTree {
    private Map<Person, List<Relationship>> relationships;

    public GenealogicalTree() {
        this.relationships = new HashMap<Person, List<Relationship>>();
    }

    public void addPerson(Person person) {
        relationships.put(person, new ArrayList<Relationship>());
    }

    public void addRelationship(Person person1, Person person2, String relationshipType) {
        Relationship relationship = new Relationship(person1, person2, relationshipType);
        relationships.get(person1).add(relationship);
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<Person>();
        List<Relationship> personRelationships = relationships.get(person);

        for (Relationship relationship : personRelationships) {
            if (relationship.getRelationshipType().equals("parent")) {
                children.add(relationship.getPerson2());
            }
        }

        return children;
    }
}


class ResearchComponent {
    private GenealogicalTree tree;

    public ResearchComponent(GenealogicalTree tree) {
        this.tree = tree;
    }

    public void printChildren(Person person) {
        List<Person> children = tree.getChildren(person);

        System.out.println("Children of " + person.getName() + ":");
        for (Person child : children) {
            System.out.println(child);
        }
    }
}


