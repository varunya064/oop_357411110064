package OOP_Lab9;

public class person {
    private String personID;
    private String name;
    private address address;
    private job job;

    //constructor

    public person(String personID, String name, OOP_Lab9.address address, OOP_Lab9.job job) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = job;
    }


    //getter and setter methods


    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OOP_Lab9.address getAddress() {
        return address;
    }

    public void setAddress(OOP_Lab9.address address) {
        this.address = address;
    }

    public OOP_Lab9.job getJob() {
        return job;
    }

    public void setJob(OOP_Lab9.job job) {
        this.job = job;
    }
    //toString

    @Override
    public String toString() {
        return "person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }
}
