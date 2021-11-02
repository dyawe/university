import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    public NaughtyStudent() {

    }

    public NaughtyStudent(Level level, String name, String id, List<Double> grades) {
        super(level, name, id, grades);
    }


    @Override
    public double getAverageGrade() {
        return super.getAverageGrade()*1.10;
    }
}
