package Day_13;
import java.util.*;

public class main {
    public static void main(String[] args) {
    //Arithmetic Operators
        int a = 10, b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

    //Bitwise Operators
        int x = 5;   // 0101 in binary
        int y = 3;   // 0011 in binary

        System.out.println(x & y); // 1 (0001)
        System.out.println(x | y); // 7 (0111)
        System.out.println(x ^ y); // 6 (0110)
        System.out.println(~x);    // -6 (2's complement)
        System.out.println(x << 1); // 10 (1010 → 5*2)
        System.out.println(x >> 1); // 2  (0010 → 5/2)

    //Writing Binary in Java
        int p = 0b1010;   // Binary for 10
        int q = 0B1111;   // Binary for 15
        System.out.println(p); // 10
        System.out.println(q); // 15

    //Converting Decimal ↔ Binary
        int num = 25;
        // Decimal to Binary
        System.out.println(Integer.toBinaryString(num)); // 11001
        // Decimal to Octal
        System.out.println(Integer.toOctalString(num)); // 31
        // Decimal to Hexadecimal
        System.out.println(Integer.toHexString(num)); // 19
    }
}
