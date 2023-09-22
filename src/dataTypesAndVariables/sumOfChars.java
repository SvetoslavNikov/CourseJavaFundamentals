package dataTypesAndVariables;
import java.util.Scanner;
//import java.lang.Math;
public class sumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String a = " ";
        int sum = 0;

        for(int i = 0; i<n ; i++){
            a = scan.nextLine();
            char b = a.charAt(0);
            sum += (int) b;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
