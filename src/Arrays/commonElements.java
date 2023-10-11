package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((b[i].equals(b[j])) && i != j && i<j) {
                    System.out.printf("%s ", b[i]);
                }
            }
        }
    }
}

//int n = Integer.parseInt(scan.nextLine());
//for (int i = 0; i < n; i++) {
//}
