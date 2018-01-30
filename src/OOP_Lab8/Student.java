package OOP_Lab8;

//person is super-class
//student is sub-class

public class Student extends Person {
private String studentID;
private String major;

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public Student(String personID,
                   String name, String gender,
                   int age, String studentID, String major) {
        //call constructor of super-class
        super(personID, name, gender, age);
        this.studentID = studentID;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}//class
