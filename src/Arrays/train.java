package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] peopleArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            peopleArr[i] = Integer.parseInt(scan.nextLine());
            sum += peopleArr[i];
        }
        System.out.println(String.join(" ", Arrays.stream(peopleArr)
                .mapToObj(e -> String.valueOf(e)).toArray(String[]::new)));
        System.out.println(sum);
    }

}
