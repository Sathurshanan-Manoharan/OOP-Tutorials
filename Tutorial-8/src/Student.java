import javax.swing.plaf.IconUIResource;
import java.util.Date;

public class Student extends Person{
    private int studentID;
    private String course;

    public Student(String name, Date dateOfBirth, int studentID, String Course) {
        super(name, dateOfBirth);
        this.course = Course;
        this.studentID = studentID;
    }
}
