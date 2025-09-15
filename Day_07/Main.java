package Day_07;
import java.util.*;

public class Main {
    public static int multiply(int a, int b){
        return a * b;
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static void factorial(int n){
        int fact = 1;
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=n; i>= 1; i--){
            fact = fact * i;
        }
        System.out.println("Factorial: " +fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //Multiplication
        int result = multiply(a, b);
        System.out.println("Multiplication: " +result);

        //Sum
        int sum = sum(a,b);
        System.out.println("Summation is: " +sum);

        //factorial
        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        factorial(n);
    }
}