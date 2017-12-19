package OOP_Lab5;
//1. input Data frin user
//2. find summation of data in array
//3. find average value data in array
//4. find macimum value of in array
//5. find minimum value of in array

import java.util.Scanner;

public class InputDataToArray {
    private static final int MaX = 10;

    public static void main(String[] args) {
        int num []=new int[MaX];
        inputData (num);
        num = inputData(num);
        showData (num);



    }//main

    private static void showData(int[] num) {
        System.out.println("Data in array:   ");
        for (int val : num)
            System.out.print(val+"  ");
    }

    private static int[] inputData(int []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]:");
            num[i]= scanner.nextInt();
        }
        return num;
    }

}//class
