package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

        //        int numRows = input.nextInt();
        //
        //        for (int i = 0; i < numRows; i++) {
        //            int number = 1;
        //            for (int j = 0; j < numRows - i; j++) {
        //                System.out.print("  "); // Print spaces for formatting
        //            }
        //            for (int j = 0; j <= i; j++) {
        //                System.out.printf("%4d", number); // Print each number with spacing
        //                number = number * (i - j) / (j + 1);
        //            }
        //            System.out.println(); // Move to the next line for the next row
        //        }
        //
        //        input.close();
        //    }
        //}