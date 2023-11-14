public class Person {
    protected String myName ; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age ;
        myGender = gender;
    }
    public String toString() {
        return myName + ", age:"  + myAge + ", gender: " +myGender;
    }

    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
