package dataTypeVariables;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        System.out.println("(-5 + 8 * 6) = " + (-5 + 8 * 6));

        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter input: ");
            int input = s.nextInt();

            for (int i = 0; i < 10; i++) {

                System.out.println(input + " × " + (i + 1) + " = " + (input * (i + 1)));
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Invalid Input");
        }

        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(result);
        System.out.printf("Result = %.3f\n",result);
        
    }
}
