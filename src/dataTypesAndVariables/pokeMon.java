
//NOT FINISHED

package dataTypesAndVariables;

import java.util.Scanner;
import java.lang.Math;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Noriginal = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        int n = Noriginal;
        int count = 0;
        do {
            count++;
            n -= m;
            if (n == Noriginal / 2) {
                if (y != 0) {
                    n = Noriginal / y;
                    count = 0;
                    do {
                        count++;
                        n -= y;
                    }while(n>y);
                    break;
                }
            }
        } while (m <= n);
        System.out.println(n);
        System.out.println(count);
    }
}

        //The Poke Mon becomes gradually more exhausted.
               // IF N becomes equal to EXACTLY 50 % of its
        //original value, you must divide N by Y, if it is
       // POSSIBLE.
                // DIVISION is between integers.


