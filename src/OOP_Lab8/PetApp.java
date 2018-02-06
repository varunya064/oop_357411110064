package OOP_Lab8;

import OOP_Lab9.cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        cat cat = new cat("Giant",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        cow cow = new cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();


    }//main

}//class