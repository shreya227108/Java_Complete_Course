package Day_03;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int age = 15;
        //If statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        //----------------------------------------------------------------------

        //If-else statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        //----------------------------------------------------------------------

        //if-else-if Ladder
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
        //----------------------------------------------------------------------

        //Nested if
        int userage = 20;
        boolean hasID = false;

        if (userage >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID required.");
            }
        } else {
            System.out.println("Underage.");
        }
        //----------------------------------------------------------------------

        //switch Statement
        int day = 5;
        switch (day) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid day");
        }
        //----------------------------------------------------------------------

        //Even_Odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre a number:");
        int x= sc.nextInt();

        if (x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //----------------------------------------------------------------------

        //Comparison
        System.out.print("Entre 1st number:");
        int a= sc.nextInt();
        System.out.print("Entre 2nd number:");
        int b= sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else if(a > b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
    }
}