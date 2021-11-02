import java.util.List;

public class Course {
    private String name;
    private Level Level;
    private String Lecturer;
    private List<Student> Student;


    public Course(String name, List<Student> student, Level level) {
        this.name = name;
        Student = student;
        Level = level;
    }



    public String getName() {
        return name;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public List<Student> getStudent() {
        return Student;
    }

    public Level getLevel() {
        return Level;
    }

    public Course(String name) {
        this.name = name;
    }


}
