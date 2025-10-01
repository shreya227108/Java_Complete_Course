package Day_14.Practice_Set_11;

public class Question4 {
    // Function: Decimal -> Binary
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);  // remainder (0 or 1)
            n /= 2;           // divide by 2
        }
        return sb.reverse().toString(); // reverse for correct order
    }

    // Function: Binary -> Decimal
    public static int binaryToDecimal(String binary) {
        int result = 0;
        int power = 1; // 2^0
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += power;
            }
            power *= 2; // next power of 2
        }
        return result;
    }

    // Main to test both functions
    public static void main(String[] args) {
        int decimal = 25;
        String binary = decimalToBinary(decimal);
        System.out.println(decimal + " in binary = " + binary);

        String binStr = "11001";
        int dec = binaryToDecimal(binStr);
        System.out.println(binStr + " in decimal = " + dec);
    }
}
