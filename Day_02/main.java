package Day_02;
import java.util.*;

public class main {
    public static void main(String[] args){
        //Printing
        System.out.println("Hello world");
        System.out.print("Hello world everyone!\n");
        System.out.print("Hello world");
        System.out.println("\n");

        //Variables and Datatypes
        int age = 20;             // integer
        double salary = 35000.75; // decimal
        char grade = 'A';         // character
        boolean isPass = true;    // boolean
        String name = "Shreya";   // string (non-primitive)

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.print("Pass Status: " + isPass);
        System.out.println("\n");

        //Sum or multiply
        int a=5;
        int b=10;
        int sum = a + b;
        int mul = a * b;
        System.out.println("sum:" +sum);
        System.out.print("Multiplication:" +mul);
        System.out.println("\n");

        //UserInput
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String UserName = sc.next();
        System.out.println("Your name: " +UserName);

        //System.out.println("Enter your full name: ");
        //String fullName = sc.nextLine();
        //System.out.println("Welcome, " + fullName + "!");

    }
}
