package Day_10;
import java.util.*;

public class main {
    public static void main(String[] args) {
        //Taking a matrix as an input and printing its elements.
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //printing
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //2.Searching for an element x in a matrix.
        int x = sc.nextInt();
        for(int k=0; k<rows; k++) {
            for(int l=0; l<cols; l++) {
                //compare with x
                if(numbers[k][l] == x) {
                    System.out.println("x found at location (" + k + ", " + l + ")");
                }
            }
        }
    }
}
