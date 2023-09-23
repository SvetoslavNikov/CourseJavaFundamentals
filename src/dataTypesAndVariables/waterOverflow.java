package dataTypesAndVariables;
import java.util.Scanner;
//import java.lang.Math;
public class waterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = 255;
        int inputs = Integer.parseInt(scan.nextLine());
        int litersIn = 0;
        for (int i = 0; i < inputs; i++) {
            int n = Integer.parseInt(scan.nextLine());
            if (litersIn + n > capacity) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                litersIn += n;
            }
        }
        System.out.printf("%d", litersIn);
    }
}