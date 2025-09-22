package Day_10.Practice_Set_08;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is:");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // Spiral traversal
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // 1. Traverse top row
            for(int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2. Traverse right column
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // 3. Traverse bottom row (only if rowStart <= rowEnd)
            if(rowStart <= rowEnd) {
                for(int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
                rowEnd--;
            }

            // 4. Traverse left column (only if colStart <= colEnd)
            if(colStart <= colEnd) {
                for(int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
