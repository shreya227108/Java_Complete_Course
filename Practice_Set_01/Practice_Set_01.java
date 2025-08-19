package Day_02;
import java.util.*;

public class Practice_Set_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.Try to declare meaningful variables of each type.
        // Eg - a variable named age should be a numeric type (int or float) not byte.
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

        //----------------------------------------------------------------------

        //2.Make a program that takes the radius of a circle as input,
        // calculates its area and prints it as output to the user.
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        final float PI = 3.14F;
        double area = PI*r*r;
        System.out.print("Area: " +area);
        System.out.println("\n");

        //----------------------------------------------------------------------

        //3.Make a program that prints the table of a number that is input by the user.

        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(num * 4);
        System.out.println(num * 5);
        System.out.println(num * 6);
        System.out.println(num * 7);
        System.out.println(num * 8);
        System.out.println(num * 9);
        System.out.println(num * 10);

    }
}
