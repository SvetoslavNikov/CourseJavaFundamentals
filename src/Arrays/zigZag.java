package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class zigZag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < n; i++) {
            String[] x = scan.nextLine().split(" ");
            int toggle1 = i%2;
            int toggle2 = (i+1)%2;
            first[i] = Integer.parseInt(x[toggle1]);
            second[i] = Integer.parseInt(x[toggle2]);
        }

        for (int i : first) {
            System.out.printf("%d ", i);
        }
        System.out.println("");

        for (int i : second) {
            System.out.printf("%d ", i);
        }
    }
}

