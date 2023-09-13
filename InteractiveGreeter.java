/*
*Author: Richard Sharp
*Date: 09/12/2023
*Class: Java 
*project: Interactive Greeter
*/

import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // name input
        System.out.println("Enter your name:");
        String nameInput = sc.nextLine();

                
        // repeat entered name back
        System.out.println("You entered your name as " +nameInput+ ".");
        System.out.println(); //added space to make the output look cleaner
               
        // ask where user is from
        System.out.println("Please enter where you are from:");
        String locationInput = sc.nextLine();
        System.out.println();//added space

        // repeat the location back
        System.out.println("You are from " +locationInput+ " that's awesome!");
        System.out.println();//added space

        // ask the user for age
        System.out.println("What is your age?");
        int ageInput = sc.nextInt();
        sc.nextLine();
        System.out.println();//added space

        // show the age entered
        System.out.println("You are " +ageInput+ " years old.");
        System.out.println();//added space

        // ask user about interests/what they like to do
        System.out.println("What is an interest/hobbie?");
        String activityInput = sc.nextLine();
        System.out.println();//added space

        System.out.println("So, you like to " +activityInput+ ". That sounds like fun!");
        System.out.println();//added space

        // ask how much the user would like to donate
        System.out.println("How much do you intend to donate today?");
        double donationInput = sc.nextDouble();
        System.out.println();//added space

        // repeat donation and thank user
        System.out.println("Your donation today is $" + String.format("%.2f",donationInput) + ". Thank you!");
        System.out.println();//added space

        sc.close();
    }
}
