
package Arrays.MoreExercise;

/*        import java.util.Arrays;
        import java.util.Scanner;

public class longestIncreasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] nums = Arrays.stream(b).mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for(int i = 0; i<nums.length;i++){
            nums[i];
            if()





            int[] len = new int[nums.length];
        }
        int len[] = new int[nums.length];*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longestIncreasing {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Dynamic programming approach to find the LIS
        int[] lisLength = new int[n];
        int[] prevIndex = new int[n];
        int maxLength = 1;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            lisLength[i] = 1;
            prevIndex[i] = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisLength[i] < lisLength[j] + 1) {
                    lisLength[i] = lisLength[j] + 1;
                    prevIndex[i] = j;
                }
            }
            if (lisLength[i] > maxLength) {
                maxLength = lisLength[i];
                endIndex = i;
            }
        }

        // Reconstruct and print the leftmost LIS
        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        while (endIndex != -1) {
            longestIncreasingSubsequence.add(0, arr[endIndex]);
            endIndex = prevIndex[endIndex];
        }

        System.out.println("Longest Increasing Subsequence (LIS):");
        for (int num : longestIncreasingSubsequence) {
            System.out.print(num + " ");
        }
    }
}


