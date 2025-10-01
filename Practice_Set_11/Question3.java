package Day_14.Practice_Set_11;

public class Question3 {
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // clear the lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 29; // binary = 11101
        System.out.println("Number of 1's in " + n + " = " + countOnes(n));
    }
}
