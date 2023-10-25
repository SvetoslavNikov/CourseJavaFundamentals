package objectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class factorel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger factorel = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            factorel = factorel.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial: " + factorel);
    }
}
