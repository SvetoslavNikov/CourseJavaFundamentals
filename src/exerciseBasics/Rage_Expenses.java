package exerciseBasics;

import java.util.Scanner;

public class Rage_Expenses {
    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetP = Double.parseDouble(scan.nextLine());
        double mouseP = Double.parseDouble(scan.nextLine());
        double keyboardP = Double.parseDouble(scan.nextLine());
        double displayP = Double.parseDouble(scan.nextLine());
        int headsets = 0;
        int mouses = 0;
        int keyboards = 0;
        int displays = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsets++;
            }
            if (i % 3 == 0) {
                mouses++;
            }
            if ((i % 2 == 0) && (i % 3 == 0)) {
                keyboards++;
                if (keyboards % 2 == 0) {
                    displays++;
                }
            }

        }
        double total = mouses * mouseP + keyboardP * keyboards + headsetP * headsets + displays * displayP;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}

