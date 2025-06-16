package Ex4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites;

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (" + description + ", " + credits + " credits, Prerequisites: " + prerequisites + ")";
    }
}