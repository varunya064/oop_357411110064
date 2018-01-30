package OOP_Lab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog=new Dog("cha",2,"bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();

       cat cat= new cat("sam",2,"Persian");
        System.out.println(cat.toString());
        cat.makeNoise();



    }

}
