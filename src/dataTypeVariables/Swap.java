package dataTypeVariables;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int number1, number2, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        number1 = s.nextInt();
        number2 = s.nextInt();
        System.out.println("Before Number1: "+number1+" Number2: "+number2);

//        Way one

        temp = number1;
        number1 = number2;
        number2 = temp;

//        Different way

//        number1 = number1 + number2;  // 5+3 = 8
//        number2 = number1 - number2;  // 8-3 = 5
//        number1 = number1 - number2;  // 8-5 = 3


        System.out.println("After Number1: "+ number1+" Number2: "+ number2);

    }
}
