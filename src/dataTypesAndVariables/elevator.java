package dataTypesAndVariables;
import java.util.Scanner;
//import java.lang.Math;
public class elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int timesUp = 0;
        do {
            timesUp++;

        } while (p - timesUp * c > 0);
        System.out.println(timesUp);
    }
}