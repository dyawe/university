import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> register = new ArrayList<>();
    private List<Student> studentsByLevel = new ArrayList<>();

    public Register(List<Nameable> students) {
        register = students;
    }

    public List<String> getRegister(){
        return register.stream()
                .map(student -> student.getName())
                .toList();
    }

//    public Map<Level, List<Student>> getRegisterByLevel(Level level){
//        return register.stream()
//                .filter(s -> s. == level)
//
//    }


    //do the print report too




//    3. Add a sort() function to your Register that takes a Comparator<Student> and returns a list of the students sorted according to the comparator.
//
//            4. Ensure that your constructor can be invoked with a List<NaughtyStudent>. Investigate wildcards to be sure this is the case.




}
