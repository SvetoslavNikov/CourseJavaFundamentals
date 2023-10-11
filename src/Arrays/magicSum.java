package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] c = Arrays.stream(b).mapToInt(value -> Integer.parseInt(value)).toArray();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((c[i] + c[j]) == n && i > j) {
                    System.out.println(c[j] + " " + c[i]);
                }
            }
        }
    }
}
