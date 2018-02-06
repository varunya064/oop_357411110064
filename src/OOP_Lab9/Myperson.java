package OOP_Lab9;

public class Myperson {
    public static void main(String[] args) {
        address address=new address("12","trang","80110");
        //jab
        job job=new job("sales",19000);
        //person
        person person=new person("12345","kwan",address,job);
        System.out.print(person.toString());

    }
}
