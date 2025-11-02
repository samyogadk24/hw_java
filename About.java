package Homework_2;

import java.util.Scanner;

public class About {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your Name? ");
        String name = input.nextLine();
        System.out.println("Welcome, " + name + "!");

        System.out.println("What's your Age? ");
        int age = input.nextInt();
        input.nextLine(); 
        System.out.println("You are " + age + " yrs old.");

        System.out.println("Which Class do you read in? ");
        int classLevel = input.nextInt();
        input.nextLine(); 
        System.out.println("You read in class " + classLevel + ".");

        System.out.println("What's your Address? ");
        String address = input.nextLine();
        System.out.println("You live in " + address + ".");

        System.out.println("What's your hobby? ");
        String hobby = input.nextLine();
        System.out.println("Your hobby is " + hobby + ".");

        input.close();
    }
}
