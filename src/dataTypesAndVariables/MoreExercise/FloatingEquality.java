
package dataTypesAndVariables.MoreExercise;

import java.math.MathContext;
import java.util.Scanner;
import java.math.BigDecimal;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathContext precision = new MathContext(6);
        BigDecimal first = new BigDecimal(scanner.nextLine());
        BigDecimal second = new BigDecimal(scanner.nextLine());
        BigDecimal epsilon = new BigDecimal("0.000001");

        boolean a = (first.subtract(second).abs().compareTo(epsilon)) <= 0 ;

        System.out.println(a);
    }
}


