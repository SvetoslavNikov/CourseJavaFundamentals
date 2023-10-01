package dataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class fromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            int first = Integer.parseInt(a[0]);
            int second = Integer.parseInt(a[1]);
            int number = 0;
            if (first < second) {
                number = second;
            } else {
                number = first;
            }
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}

