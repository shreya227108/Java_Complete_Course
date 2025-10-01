package Day_14;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

//        //Get Bit
//        if((bitMask & n) == 0) {
//            System.out.println("bit was zero");
//        } else {
//            System.out.println("bit was one");
//        }
//
//        //Set Bit
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

        //Clear Bit
//        int newBitMask = ~(bitMask);
//        int newNumber = newBitMask & n;
//        System.out.println(newNumber);

        //Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
