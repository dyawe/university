import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel{
    private Level level;
    private String name;
    private String id;
    private List<Double> grades = new ArrayList<Double>();

    public Student(Level level, String name, String id, List<Double> grades) {
        this.level = level;
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    public Student(String name, String id, Level level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public Student() {

    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public Level getLevel() {
        return level;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade(){
        return grades.stream().mapToDouble(value -> value).average().getAsDouble();
    }
//        double total = grades.stream().reduce(0.00,Double::sum);
//        int count = grades.size();
//        return total/count;


    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grades=" + grades +
                '}';
    }


}
