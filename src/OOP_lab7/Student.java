package OOP_lab7;
//Talking about Student?
// 1.student id
// 2.major
// 3.Faculty
// 4.Name

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String id ;
        private String major ;
        private String faculty ;
        private String name ;
        //constructor
        //Default constructor
        public Student (){}
        //create constructor by owner
        public Student (String id,String m,String f,String n){
            //asigne data to class properties
        this.id =id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}//calss
