public class Student extends Person{
    private double fee;
    private int grade;
    private int IDNumber;

    public Student(String name, int age, String gender, int IDNumber) {
        super(name, age, gender);
    }

    public double getFee() {
        return fee;
    }

    public int getGrade() {
        return grade;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
