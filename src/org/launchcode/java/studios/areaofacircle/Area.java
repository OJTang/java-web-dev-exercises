package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            while (radius <= 0) {
                System.out.println("Enter the radius of your circle: ");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("The area of your circle is " + area + ".");
            input.close();
        } else {
            System.out.println("That is invalid input.");
            input.close();
        }
    }
}
