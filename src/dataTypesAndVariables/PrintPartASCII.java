package dataTypesAndVariables;
import java.util.Scanner;
//import java.lang.Math;
public class PrintPartASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        for (int i = start; i <= end; i++) {
            char a = (char) i;
            System.out.println(a + " ");
        }
    }
    }

