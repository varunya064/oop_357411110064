package OOP_lab7;
import java.util.Scanner;

public class mySuperCar {

    public static void main(String[] args) {
        //create Ojbects as SuperCar
        SuperCer superCar1 = new SuperCer();
        superCar1.setBrand("Toyata");
        superCar1.setColor("Rad");
        superCar1.setSize("3000cc");
        superCar1.setSpeed("200/ชม.");
        superCar1.setCountry("Japan");
        System.out.println(superCar1.toString());

        SuperCer superCar2 = new SuperCer();
        superCar2 = inputData(superCar2);
        System.out.println(superCar2.toString());

    }//main

    private static SuperCer inputData(SuperCer s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your SuperCar data: ");
        System.out.print("brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("color: ");
        s.setColor(scanner.nextLine());
        System.out.print("size: ");
        s.setSize(scanner.nextLine());
        System.out.print("speed: ");
        s.setSpeed(scanner.nextLine());
        System.out.print("country: ");
        s.setCountry(scanner.nextLine());


        return s;


    }
}


