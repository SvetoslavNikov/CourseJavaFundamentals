package dataTypesAndVariables;

import java.util.Scanner;
import java.lang.Math;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = Integer.parseInt(scan.nextLine());
        String biggestModel = null;
        float biggest = 0;
        for (int i = 0; i < times; i++) {
            String model = scan.nextLine();
            float radius = Float.parseFloat(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            float volume = (float) Math.PI * radius * 2 * (float) height;

            if (biggest < volume) {
                biggest = volume;
                biggestModel = model;
            }
        }
        System.out.printf("%s%n",biggestModel);
    }
}
        
        
