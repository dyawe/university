import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    NaughtyStudent naughty = new NaughtyStudent();
    NaughtyStudent naughty1 = new NaughtyStudent(List.of(2.0,2.0));

    @Test
    void isNaughtyStudentAnInstanceOfStudent(){
        assertTrue(naughty instanceof Student);
    }

    @Test
    void checkIfANaughtyStudentIsANaughtyStudent(){

        double expected = 2.0 *1.1;
        double actual = naughty1.getAverageGrade();

        assertEquals(expected,actual);
    }




}
