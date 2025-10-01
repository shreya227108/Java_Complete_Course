package Day_14.Practice_Set_11;

public class Question2 {
    public static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);
    }

    public static void main(String[] args) {
        int n = 10; // binary 1010
        int pos = 1;
        System.out.println("Before toggle: " + n + " (" + Integer.toBinaryString(n) + ")");
        int result = toggleBit(n, pos);
        System.out.println("After toggle at pos " + pos + ": " + result + " (" + Integer.toBinaryString(result) + ")");
    }
}
