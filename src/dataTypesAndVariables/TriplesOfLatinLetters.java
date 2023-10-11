package dataTypesAndVariables;
import java.util.Scanner;
//import java.lang.Math;
public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        char a;
        char b;
        char c;
        for (int i = 0; i < start; i++)
        {
            a = (char) (97 + i);
            for (int j = 0; j < start; j++)
            {
                b = (char) (97 + j);
                for (int k = 0; k < start; k++)
                {
                    c = (char) (97 + k);
                    System.out.printf("%c%c%c%n", a ,b, c);
                }
            }
        }
    }
}
