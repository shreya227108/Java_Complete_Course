package Day_07;
import java.util.*;

public class Practice_Set_06 {
    //1.Make a function to check if a number is prime or not.
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //===============================================================

    //2.Make a function to check if a given number n is even or not.
    public static boolean evenOdd(int n){
        if( n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //===============================================================

    //3.Make a function to print the table of a given number n.
    public static void table(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //1.Prime number
//        if (prime(n)) {
//            System.out.println(n + " is a Prime Number");
//        } else {
//            System.out.println(n + " is NOT a Prime Number");
//        }

        //2.EvenOdd
//        if(evenOdd(n)){
//            System.out.println(n + " is a even number.");
//        }else{
//            System.out.println(n + " is a odd number.");
//        }

        //3.Table
        table(n);
    }
}
