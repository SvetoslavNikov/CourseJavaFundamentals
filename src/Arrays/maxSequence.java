package Arrays;








//UNFINISHED









import java.util.Arrays;
import java.util.Scanner;

public class maxSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] c = Arrays.stream(b).mapToInt(value -> Integer.parseInt(value)).toArray();

        int[] count = new int[b.length];
        int biggestcountNumber = 0;
        for (int i = 0; i < b.length; i++)
        {

            for (int j = i + 1; j < b.length; j++)
            {

                if (c[j - 1] == c[j]) {
                    count[i]++;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < b.length-1; i++) {
            if (count[i] > count[i + 1]) {
                biggestcountNumber = i-1;
            }
        }

        for(int i = biggestcountNumber; i< count[biggestcountNumber]; i++){
            System.out.println(c[count[biggestcountNumber]]);
        }



    }
}