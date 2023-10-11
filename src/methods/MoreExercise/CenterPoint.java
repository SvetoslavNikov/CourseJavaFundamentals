package methods.MoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        printShorterVector(x1, y1, x2, y2);
//double n = Double.parseDouble(scanner.nextLine());
//String s = scanner.nextLine();
//for(int i = 0; i<n; n++){
    }

    public static void printShorterVector(int x1, int y1, int x2, int y2) {
        BigDecimal vector1 = BigDecimal.valueOf(Math.sqrt(x1 * x1 + y1 * y1));
        BigDecimal vector2 = BigDecimal.valueOf(Math.sqrt(x2 * x2 + y2 * y2));
        int a = vector1.compareTo(vector2);
        //-1, 0, or 1 as this BigDecimal is numerically less than,
        // equal to, or greater than va
        if (a < 0) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if (a == 0) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }
}

