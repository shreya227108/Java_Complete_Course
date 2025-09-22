package Day_09;
import java.util.*;

public class  main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        int[] sub_marks = {98, 97, 95};
        System.out.println(marks[2]);
        System.out.println(sub_marks[0]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.print("Enter the numbers to fill in array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i< numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

    }
}