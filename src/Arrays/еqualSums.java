package Arrays;


import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class еqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] c = Arrays.stream(b).mapToInt(value -> Integer.parseInt(value)).toArray();

        // c[2] c[3]+c[4]+c[5] == c[0]+c[1]



        boolean noEqualSums = true;
        for (int i = 0; i <= b.length; i++) {
            int rightSum = 0;
            int leftSum = 0;
            for (int j = i + 1; j < b.length; j++) {
                rightSum += c[j];
            }

            for (int z = i - 1 ; z >= 0; z--) {
                leftSum += c[z];
            }

            if (leftSum == rightSum) {
                System.out.printf("%d ", i);
                noEqualSums = false;
            }
        }
        if(noEqualSums){
            System.out.println("no");
        }
    }
}