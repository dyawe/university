import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    @Test
    void registerReturnsTheCorrectValues(){
        List<String> namesInRegister = new ArrayList<>();
        List<String> names = new ArrayList<>();

        List<Nameable> students = List.of(
                new Student("Yawe", "001", Level.First),
                new Student("Love", "012", Level.Fourth),
                new Student("Elorm", "013", Level.Fourth)
        );

         Register r = new Register(students);
         namesInRegister = r.getRegister();
         names = students.stream().map(student -> student.getName())
                 .toList();


         assertTrue(namesInRegister.equals(names));



    }

}