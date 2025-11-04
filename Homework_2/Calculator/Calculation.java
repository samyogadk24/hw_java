import java.util.Scanner;

public class Calculation {

    public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the First Number");
     double num1 = input.nextDouble();

     System.out.println("Enter an operator (+, -, *, /): ");
     char operator = input.next().charAt(0);

      System.out.println("Enter the Second Number: ");
        double num2 = input.nextDouble();

        double number;

        switch (operator) {
            case '+':
                number= num1 + num2;
                System.out.println("Result: " + number);
                break;

            case '-':
                number = num1 - num2;
                System.out.println("Result: " + number);
                break;

            case '*':
                number = num1 * num2;
                System.out.println("Result: " + number);
                break;

            case '/':
               number = num1 / num2;
               System.out.println("Result:"+ number);
                break;

            default:
                System.out.println("Invalid operator!");
                break;

             } 
      input.close();
            
        }
}

