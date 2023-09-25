package dataTypesAndVariables;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int n = 0;
        while (s.charAt(n) != '\0') {
            n++;
        }
        System.out.println(n);
    }
}
