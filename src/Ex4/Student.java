package Ex4;
public class Student {
    private String name;
    private int age;
    private String YearOfStudy;

    public Student(String name, int age, String YearOfStudy) {
        this.name = name;
        this.age = age;
        this.YearOfStudy = YearOfStudy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getYearOfStudy() {
        return YearOfStudy;
    }

    public void setYearOfStudy(String YearOfStudy) {
        this.YearOfStudy = YearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", YearOfStudy='" + YearOfStudy + '\'' +
                 + '\'' +
                '}';
    }
}

