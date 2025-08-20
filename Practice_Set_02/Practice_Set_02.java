package Day_03;
import java.util.*;

public class Practice_Set_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        //	1 : + (Addition) a + b
        //2 : - (Subtraction) a - b
        //3 : * (Multiplication) a * b
        //4 : / (Division) a / b
        //5 : % (Modulo or remainder) a % b
        //Calculate the result according to the operation given and display it to the user.

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b= sc.nextInt();

        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");
        System.out.print("\nChoose an operation from above:");

        int opt=sc.nextInt();
        double result = 0;

        switch (opt){
            case 1 : result = a + b;
            System.out.println("Addition is: " +result);
            break;

            case 2 : result = a - b;
            System.out.println("Subtraction is: " +result);
            break;

            case 3 : result = a * b;
            System.out.println("Multiplication is: " +result);
            break;

            case 4 :
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed!");
                }
            break;

            case 5 :
                if (b != 0) {
                    result = a % b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Modulo by zero not allowed!");
                }
            break;

            default:System.out.println("Invalid choice! Please enter from 1–5.");
        }

        //=====================================================================================

        //2.Ask the user to enter the number of the month & print the name of the month.
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        System.out.print("Entre the number to print the name of the month: ");
        int month =sc.nextInt();
        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default: System.out.println("Invalid month");
        }
    }
}
