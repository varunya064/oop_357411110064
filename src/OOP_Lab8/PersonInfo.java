package OOP_Lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("1801700071182",
                "kwan",
                "male",
                20,
                "357411110064",
                "IS");

        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee("25666",
                "nook", "kie", 22, "5545",
                "hjiu", "30000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());
    }


}

