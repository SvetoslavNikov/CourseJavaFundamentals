package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int[] x = new int[name.length()];
            for (int j = 0; j < name.length(); j++) {
                x[j] = name.charAt(j);
                if (x[j] == 'A' || x[j] == 'E' || x[j] == 'I' || x[j] == 'O' || x[j] == 'U'
                        || x[j] == 'a' || x[j] == 'e' || x[j] == 'i' || x[j] == 'o' || x[j] == 'u') {
                    sum[i] += x[j] * name.length();
                }
                else{
                    sum[i] += x[j] / name.length();
                }
            }
        }
        Arrays.sort(sum);
        for (int e : sum) {
            System.out.println(e);
        }
    }
}
        /*input
        int people = Integer.parseInt(scan.nextLine());
        String b = scan.nextLine();
        String[] c = b.split(" ");
        int[] seats = Arrays.stream(c).mapToInt(value -> Integer.parseInt(value)).toArray();

        //placing people to seats
        boolean emptySeats = false;
        outerloop:
        for (int i = 0; i < c.length; i++) {
            for (int j = seats[i]; j < 4; j++) {
            */


