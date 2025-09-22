package Day_10.Practice_Set_08;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //1.Print Spiral Order
        System.out.println("The Spiral Order Matrix is:");
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = m - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            // 1. Top row
            for(int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2. Right column
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // 3. Bottom row
            if(rowStart <= rowEnd) {
                for(int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
                rowEnd--;
            }

            // 4. Left column
            if(colStart <= colEnd) {
                for(int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
                colStart++;
            }
        }

        System.out.println(); // line break

        //2.Print Transpose
        System.out.println("The Transpose Matrix is:");
        for(int i=0; i<m; i++) { // columns become rows
            for(int j=0; j<n; j++) { // rows become columns
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
