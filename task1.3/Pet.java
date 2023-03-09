public class Pet {
    private String name;
    private String species;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Other methods

    public void respondToCall(String call) {
        if (call.equals("kis-kis")) {
            System.out.println(name + " meows in response.");
        } else {
            System.out.println(name + " ignores the call.");
        }
    }
}

