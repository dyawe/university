import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    void getAverageGrade() {

        List<Double> list = of(12.5, 13.5, 16.5,18.5,12.7,34.6);
        Student st = new Student(list);
        assertEquals(list.stream().mapToDouble((value) -> value).summaryStatistics().getAverage(), st.getAverageGrade() );
    }





}