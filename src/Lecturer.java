public class Lecturer {
    private String name;

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Lecturer(String name, String course) {
        this.name = name;
        this.course = course;
    }

    private String course;

}
