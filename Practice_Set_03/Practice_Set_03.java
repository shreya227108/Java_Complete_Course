package Day_04;
import java.util.*;

public class Practice_Set_03 {
    public static void main(String[] args) {
        //1.Print all even numbers till n.
          Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }

        //2.Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        //If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        //If they enter 0 then stop.
        //If he/ she scores :
        //Marks >=90 -> print “This is Good”
        //89 >= Marks >= 60 -> print “This is also Good”
        //59 >= Marks >= 0 -> print “This is Good as well”
        //	Because marks don’t matter but our effort does.
        //(Hint : use do-while loop but think & understand why)
//        int n;
//        do {
//            System.out.println("Enter 1 to input marks, or 0 to stop: ");
//            n = sc.nextInt();
//
//            if (n == 1) {
//                System.out.println("Enter the makrs out of 100: ");
//                int marks = sc.nextInt();
//
//                if (marks < 0 || marks > 100) {
//                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
//                } else {
//                    if(marks >= 90){
//                        System.out.println("This is good");
//                    } else if (marks >= 60) {
//                        System.out.println("This is also good");
//                    } else{
//                        System.out.println("This is Good as well");
//                    }
//                }
//            }
//        }while(n != 0);
//        System.out.println("Thanks!");

        //3.Print if a number is prime or not (Input n from the user).
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }else{
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(n + " is a Prime number.");
        }else{
            System.out.println(n + " is not a Prime number.");
        }
    }
}
