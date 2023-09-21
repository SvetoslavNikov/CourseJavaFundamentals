import java.util.Scanner;
import java.lang.String;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 5115;
        String a = String.valueOf(i);
        char firste = a.charAt(1);
        int first = Integer.parseInt(String.valueOf(firste));
        System.out.println(first);
    }
}