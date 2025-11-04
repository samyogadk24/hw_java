import java.util.Scanner;

public class Season {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Name of the months ");
        String months = input.nextLine();

        String season=" ";
        int Invalid = 0;
        switch (months) {
            case "December":
            case "January":
            case "February":
            season = "Winter";

            System.out.println(" The name of the season is "+season);
            break;



            case "March":
            case "April":
            case "May":
            season = "Spring";
              System.out.println(" The name of the season is "+season);
            break;
                


            case "June":
            case "July":
            case "August":
            season = "Summer";
              System.out.println(" The name of the season is "+season);
            break;
                

            case "September":
            case "October":
            case "November":
            season = "Autumn";
              System.out.println(" The name of the season is "+season);
            break;
                

            default:
                System.out.println("Invalid Name of months");
            

        }
        
        
        
        input.close();
    }
}