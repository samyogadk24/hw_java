import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Welcome to Class 11 ==");
        System.out.println("Services we provide:");


        System.out.println("1. Software Development");
        System.out.println("2. Automation");
        System.out.println("3. Web Development");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have choosen Software Development");
                break;

            case 2:
                System.out.println("You have choosen Automation");
                break;

            case 3:
                System.out.println("You have choosen Web Development");
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid Option!... ");
        }
    }
}
