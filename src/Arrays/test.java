//import java.lang.reflect.Array;
//import java.math.BigDecimal;
//import java.math.MathContext;

package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());
        //for (int i = 0; i < n; i++) {
        //}
        //int numbers = new int[10];

        String[] s = scan.nextLine().split(" ");//inout only integers
        System.out.println(String.join("->", s));

        int[] stringToInteger = Arrays.stream(s)
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String[] integerToString = Arrays.stream(stringToInteger)
                .mapToObj(e -> String.valueOf(e))
                .toArray(String[]::new);

        Object[] integerToObject = Arrays.stream(stringToInteger)
                .mapToObj(e -> String.valueOf(e))
                .toArray();
    }
}

        /*for (int i = 0; i < n; i++) {
         }
        Object[] intToS = new Object[3];
        for (int i = 0; i < intToS.length; i++) {
            intToS[i] = scan.nextLine();
        }
        int a = Integer.parseInt(String.valueOf(intToS[0]));
        char b = (String.valueOf(intToS)).charAt(0);
        double x = Double.parseDouble(String.valueOf(intToS[2]));
        for (Object element : intToS) {
            System.out.println(element);
        }
    }
}*/



