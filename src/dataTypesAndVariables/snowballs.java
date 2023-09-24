package dataTypesAndVariables;



//Not FINISHED
import java.util.Scanner;
import java.lang.Math;

public class snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int snow = 0;
        int time = 0;
        int quality = 0;
        int snowball = 0;
        for (int i = 0; i < N; i++) {
            snow = Integer.parseInt(scan.nextLine());
            time = Integer.parseInt(scan.nextLine());
            quality = Integer.parseInt(scan.nextLine());
            snowball = (int) Math.pow((snow / time), quality);

        }
        System.out.printf("%d : %d = %d (%d)", snow, time, snowball, quality);
    }
}
