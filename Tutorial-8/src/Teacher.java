import java.util.Date;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, Date dateOfBirth, double salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }
}
