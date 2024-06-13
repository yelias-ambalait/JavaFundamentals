package dataTypeVariables;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius, height, width, length, base, side1, side2;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = s.nextDouble();

        System.out.printf("Area of Circle: %.3f\n",circle(radius));
        System.out.printf("Perimeter of Circle: %.3f\n",perimeterOfCircle(radius));

        System.out.println("Enter Height and Width of the Rectangle:");
        height = s.nextDouble();
        width = s.nextDouble();
        System.out.printf("Area of Rectangle: %.2f\n", rectangle(height, width));
        System.out.printf("Perimeter of Rectangle: %.2f\n", perimeterOfRectangle(height, width));

        System.out.println("Enter Length of Square:");
        length = s.nextDouble();
        System.out.printf("Area of Square: %.2f\n", square(length));
        System.out.printf("Perimeter of Square: %.2f\n", perimeterOfSquare(length));

        System.out.println("Enter base and height of Triangle:");
        base = s.nextDouble();
        System.out.printf("Area of Triangle: %.2f\n", triangle(base, height));

        System.out.println("Enter 3 input of Triangle:");
        side1 = s.nextDouble();
        side2 = s.nextDouble();
        System.out.printf("Perimeter of Triangle: %.2f\n", perimeterOfTriangle(base, side1, side2));
    }
    public static double circle(double radius){
        return Math.PI * radius * radius;
    }
    public static double perimeterOfCircle( double radius){
        return 2 * Math.PI * radius;
    }

    public static double rectangle( double height, double width){
        return height * width ;
    }
    public static double perimeterOfRectangle( double height, double width){
        return height + width ;
    }
    public static double square( double a){
        return a * a ;
    }
    public static double perimeterOfSquare( double a){
        return 2 * a ;
    }

    public static double triangle( double base, double height){
        return 0.5 * base * height ;
    }
    public static double perimeterOfTriangle( double base, double side1, double side2){
        return base + side1 + side2;
    }
}
