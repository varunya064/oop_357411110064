package OOP_Lab3;

public class Testwhileloop {
    public static void main(String[] args) {
   //      while
            int i =1;
            while (i<=10){
                System.out.print(i+" ");
                i++;

            }//while

//      while
        int e = 1;
        while (e<=50){
            System.out.print(e+" ");
            if (e%10==0)
                System.out.print(" Hello ");
            e++;

        }//while


 //    do-while
        System.out.print("\n");
        int j=1;
        do {
            System.out.print(j + "  ");
                j++;

            }while (j<=10);

//    do-while
        System.out.print("\n");
        int a=1;
        do {
            System.out.print(a + " ");
            if (a%2 !=0)
                System.out.print("Hello ");
            a++;

        }while (a<=10);





    }//main
}//class
