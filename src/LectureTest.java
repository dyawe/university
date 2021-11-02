import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void getHighestAverageGrade() {
        List<Double> gradeListOne = new ArrayList<>();
        List<Double> gradeListTwo = new ArrayList<>();

        gradeListOne.add(34.9);
        gradeListOne.add(90.2); // 62.55

        gradeListTwo.add(54.9);
        gradeListTwo.add(30.2); // 42.55

        Student studentOne = new Student(gradeListOne);
        Student studentTwo = new Student(gradeListTwo);

        Lecture lecture = new Lecture();

        lecture.enter(studentOne);
        lecture.enter(studentTwo);

        double highest = Math.round(lecture.getHighestAverageGrade()*100.00/100.00);

        assertEquals(63.0, highest, "Test Passed");
    }


    @Test
    void isNaughtyStudentScoringHigher(){
        Student Yawe = new Student(Level.First, "Naughty Yawe", "014", List.of(1.1,2.2,3.3) );
        Student nYawe = new NaughtyStudent(Level.First, "Naughty Yawe", "014", List.of(1.1,2.2,3.3) );

        double naughtyAverage = nYawe.getAverageGrade();
        double realAverage = Yawe.getAverageGrade();

        assertTrue(realAverage< naughtyAverage);



    }
}