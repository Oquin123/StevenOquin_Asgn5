/**
 * Name: Steven Oquin
 * Date: 02/21/2023
 * Class: CMIS 141/6380
 * This program prompts the user on which action they want to take, calculates the inputs then returns the result.
 */

import java.util.Scanner;

public class StevenOquin_Asgn5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        //prompts user for the following depending on the choice they make
        do {
            System.out.println("MENU");
            System.out.println("1: Convert cubic feet to U.S. bushels");
            System.out.println("2: Convert miles to kilometers");
            System.out.println("3: Determine graduation title with honors");
            System.out.println("9: Exit program");

            System.out.print("\nEnter your selection: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter cubic feet: ");
                    double cubicFeet = sc.nextDouble();
                    double bushels = cubicFeetToBushels(cubicFeet);
                    System.out.println(cubicFeet + " cubic ft. = " + bushels + " U.S. bushels\n");
                    break;

                case 2:
                    System.out.print("\nEnter miles: ");
                    double miles = sc.nextDouble();
                    double kilometers = milesToKilometers(miles);
                    System.out.println(miles + " miles = " + kilometers + " km\n");
                    break;

                case 3:
                    System.out.print("\nEnter GPA: ");
                    double gpa = sc.nextDouble();
                    String honorsTitle = determineHonorsTitle(gpa);
                    System.out.println("Congratulations, you have graduated " + honorsTitle + "!\n");
                    break;

                case 9:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.\n");
            }
        } while (choice != 9);
    }

    // Converts cubic feet to U.S. bushels using the formula 1 cubic foot = 0.803564 U.S. bushel.
    public static double cubicFeetToBushels(double cubicFeet) {
        return cubicFeet * 0.803564;
    }

    // Converts miles to kilometers using the formula 1 mile = 1.60934 km.
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // Determines the graduation honors title (if any) based on the GPA.
    public static String determineHonorsTitle(double gpa) {

        String title;

        switch ((int) (gpa * 10)) {
            case 40:
                title = "Summa Cum Laude";
                break;

            case 39:
            case 38:
                title = "Magna Cum Laude";
                break;

            case 37:
            case 36:
            case 35:
                title = "Cum Laude";
                break;

            default:
                title = "with no honors";
                break;
        }
        return title;
    }
}