package patterns.behavior.iterator;

public class Staff {
    private String name;
    private String gender;

    public Staff(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
