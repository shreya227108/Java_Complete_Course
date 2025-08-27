package Day_04;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        //For loop
//        System.out.println("This is for loop");
//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
//            //System.out.println("Hello World!");
//        }
//
//        //while loop
//        System.out.println("This is while loop");
//        int i=0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }
//
//        //Do while loop
//        System.out.println("This is do while loop");
//        int j=0;
//        do{
//            System.out.println(j);
//            j++;
//        }while(j<11);

//        //Sum of n natural numbers
//        System.out.print("Enter a number: ");
//        int n= sc.nextInt();
//
//        int sum=0;
//
//        for (int k = 1; k <= n ; k++) {
//            sum = sum + k;
//        }
//        System.out.println(sum);

        //Printing a table
        System.out.print("Enter a number: ");
        int a =sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a * i);
        }

    }
}
