package dataTypesAndVariables;

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
        int highestValue = 0;
        int printTime = 0;
        int printSnow = 0;
        int printQuality = 0;
        for (int i = 0; i < N; i++) {
            snow = Integer.parseInt(scan.nextLine());
            time = Integer.parseInt(scan.nextLine());
            quality = Integer.parseInt(scan.nextLine());
            snowball = (int) Math.pow((snow / time), quality);
            if (highestValue < snowball) {
                highestValue = snowball;
                printTime = time;
                printSnow = snow;
                printQuality = quality;
            }

        }
        System.out.printf("%d : %d = %d (%d)", printSnow, printTime,
                highestValue, printQuality);
    }
}

/*3
10
5
7
16
4
2
20
2
2*/