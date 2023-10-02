package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] dna = new int[10][];
        int i = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Clone them!")) {
                break;
            } else {
                String[] numbers = input.split("!");

                dna[i] = Arrays.stream(numbers).mapToInt(e -> Integer.parseInt(e)).toArray();
                i++;
            }
        }

        //we have created dna - array of arrays.
        //dna[0][1] is the second number of the first array

        //find the array with longest sequence of ones
        int count[] = new int[i];
        int[] totalAmountOfOnes = new int[i];
        int[] highestcountOfTheArray = new int[i];
        int[] nullsBeforeHighestSequence = new int[i];
        int[] nulls = new int[i];
        int[] bestDNA = new int[n];

        for (int j = i-1; j >= 0; j--) {
            for (int z = 0; z < dna[j].length; z++) {

                if (1 == dna[j][z]) {
                    count[j]++;
                    totalAmountOfOnes[j]++;
                    if (count[j] > highestcountOfTheArray[j]) {
                        highestcountOfTheArray[j] = count[j];
                        nullsBeforeHighestSequence[j] = nulls[j];
                    }
                    nulls[j] = 0;
                } else if (0 == dna[j][z]) {
                    count[j] = 0;
                    nulls[j]++;
                }
            }
        }
        for(int j = i-1; j>=0; j--){
            if (j != 0) {
                if (highestcountOfTheArray[j-1] > highestcountOfTheArray[j]) {
                    bestDNA = dna[j-1];
                } else if (highestcountOfTheArray[j-1] == highestcountOfTheArray[j]){
                    if(nullsBeforeHighestSequence[j-1] < nullsBeforeHighestSequence[j]){
                        bestDNA = dna[j-1];
                    } else if (nullsBeforeHighestSequence[j-1] == nullsBeforeHighestSequence[j]) {
                        if(totalAmountOfOnes[j-1]>totalAmountOfOnes[j]){
                            bestDNA = dna[j-1];
                        }
                    }
                }
            }
        }

        for (int e : bestDNA) {
            System.out.print(e + " ");
        }


        //finding which how many ones have the lonegest
        /*for (int j = 1; j < i; j++) {
            if (count[j - 1] < count[j]) {
                count[0] = count[j];
            }
        }
        System.out.println(count[0]);*/
    }
}






