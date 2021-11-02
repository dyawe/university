import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Lecture {
    //create a variable students of type Student from the Student class
    private List<Student> students = new LinkedList<Student>();

    public void enter(Student student){
        students.add(student);
    }

    public double getHighestAverageGrade(){
        double maxAverage = students.get(0).getAverageGrade();
        for (Student aStudent : this.students) {
            if (aStudent.getAverageGrade() > maxAverage)
                maxAverage = aStudent.getAverageGrade();
        }
        return maxAverage;
    }
//    public Double getHighestAverageGrade(){
//
//        //return ;
//    }


    public double totalAverageGrade(){
        Object reduce = students.stream()
                .map(student -> student.getGrades());
//                .reduce(0.0,->)
        return 0.0;
        //flatMapToDouble(student -> student.getGrades().stream().mapMultiToDouble())
    }
}
