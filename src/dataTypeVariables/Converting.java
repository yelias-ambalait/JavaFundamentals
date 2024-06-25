package dataTypeVariables;

import java.util.Scanner;

public class Converting {

    private static final double INCHES_TO_CM = 2.54;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double METERS_TO_FEET = 1 / FEET_TO_METERS;
    private static final double CM_TO_INCHES = 1 / INCHES_TO_CM;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display conversion options
            System.out.println("Select conversion type:");
            System.out.println("1. Inches to Centimeters");
            System.out.println("2. Centimeters to Inches");
            System.out.println("3. Feet to Meters");
            System.out.println("4. Meters to Feet");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice == 5) {
                break;
            }

            System.out.println("Enter value to convert:");
            double value = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = value * INCHES_TO_CM;
                    System.out.println(value + " inches is " + result + " centimeters");
                    break;
                case 2:
                    result = value * CM_TO_INCHES;
                    System.out.println(value + " centimeters is " + result + " inches");
                    break;
                case 3:
                    result = value * FEET_TO_METERS;
                    System.out.println(value + " feet is " + result + " meters");
                    break;
                case 4:
                    result = value * METERS_TO_FEET;
                    System.out.println(value + " meters is " + result + " feet");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
