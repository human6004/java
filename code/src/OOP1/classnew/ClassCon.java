package OOP1.classnew;

public class ClassCon extends ClassCha {
    private String className;
    private double gpa;
    public ClassCon(String className, double gpa, String name, String birth) {
        super(name,birth);
        this.className = className;
        this.gpa = gpa;
    }
}
