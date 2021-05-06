package exercises;
import java.util.Scanner;

public class Miles {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many miles you have driven: ");
        int milesDriven = input.nextInt();
        System.out.println("Enter how many gallons of fuel that you've used: ");
        int gallonsConsumed = input.nextInt();
        System.out.println("Your vehicle is getting " + (milesDriven / gallonsConsumed) + " miles per gallon.");
        input.close();
    }
}
