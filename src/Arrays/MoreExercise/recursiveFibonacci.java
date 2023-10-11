package Arrays.MoreExercise;

        import java.util.Arrays;
        import java.util.Scanner;

public class recursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers = Integer.parseInt(scan.nextLine());

        int[] n = new int[numbers];
        n[0] = 1;
        n[1] = 1;
        n[2] = 2;
        for (int i = 3; i < n.length; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        for (int e : n) {
            System.out.print(e+" ");
        }
    }
}
