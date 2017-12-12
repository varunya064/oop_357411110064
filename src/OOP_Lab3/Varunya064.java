package OOP_Lab3;
import java.util.Scanner;

public class Varunya064 {
    public static void main(String[] args) {
        String PIN = "1234",input ;
        int conut = 0 ;
        Scanner scanner = new Scanner(System.in);
                do {
                    System.out.print("Enter PIN");
                    input = scanner.nextLine();
                    if (PIN.equals(input)) {
                        System.out.println("Welcome");
                        break;
                    } else {
                        conut++;
                        if (conut == 3) {
                            System.out.println("Locked");
                            break;
                        }

                    }
                }while (conut<=3);



    }//main

}//class
