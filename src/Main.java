import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
//        NEW STUDENTS
        List<Student> students = List.of(
                new Student("Yawe", "001", Level.First),
                new Student("Enam", "002", Level.First),
                new Student("Ama", "003", Level.First),
                new Student("Kofi", "004", Level.First),
                new Student("Kojo", "005", Level.First),
                new Student("Lawson", "006", Level.Second),
                new Student("David", "007", Level.Second),
                new Student("Sam", "008", Level.Second),
                new Student("Mary", "009", Level.Third),
                new Student("Adwoa", "010", Level.Third),
                new Student("Patience", "011", Level.Fourth),
                new Student("Love", "012", Level.Fourth),
                new Student("Elorm", "013", Level.Fourth)
                );

        //NAUGHTY STUDENTS
        Student nYawe = new NaughtyStudent(Level.First, "Naughty Yawe", "014", List.of(1.1,2.2,3.3) );
        Student nEnam = new Student(Level.Second, "Naughty Enam", "015",  List.of(1.1,2.2,3.3) );
        Student nElorm = new Student(Level.Fourth,"Naughty Elorm", "016",  List.of(1.1,2.2,3.3));


        Lecture lecture = new Lecture();
        lecture.enter(nYawe);
        lecture.enter(nEnam);
        lecture.enter(nElorm);


//        NEW COURSE
        List<Student> FirstYears = students.stream().filter(student -> student.getLevel() == Level.First).collect(Collectors.toList());
        //System.out.println(FirstYears);

        List<Student> GardeningStudents = students.stream().filter(student -> student.getLevel() != Level.First )
                .filter(student -> student.getLevel() != Level.Second)
                .collect(Collectors.toList());
        //System.out.println(GardeningStudents);

        Course IntrotoProgramming = new Course("Intro to Programming", FirstYears, Level.First);
        Course AdvancedGardening = new Course("Advanced Gardening", FirstYears, Level.Fourth);

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');



//        List<Student> PhysicsStudents = students.stream()
//                .filter(student -> student.getName().toLowerCase().startsWith("a") ||student.getName().toLowerCase().startsWith("e") || student.getName().toLowerCase().startsWith("i") || student.getName().toLowerCase().startsWith("o") || student.getName().toLowerCase().startsWith("u"))
//                .collect(Collectors.toList());
//        System.out.println(PhysicsStudents);


        List<Student> PhysicsStudents = students.stream().filter(s -> s.getLevel() == Level.Fourth && vowels.contains(s.getName()
                .toLowerCase().charAt(0))).collect(Collectors.toList());
        System.out.println(PhysicsStudents);

        List <Double> grades = of(12.5, 13.5, 16.5,18.5);


        Student student = new Student(grades);

        double averageGrade = student.getAverageGrade();

    }
}
