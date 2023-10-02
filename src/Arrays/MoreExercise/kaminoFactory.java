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


        //taking mejurments
        int count[] = new int[i];
        int[] totalAmountOfOnes = new int[i];
        int[] highestcountOfTheArray = new int[i];
        int[] digitsBeforeHighestSequence = new int[i];
        int[] digits = new int[i];
        int[] bestDNA = new int[i];

        for (int j = 0; j<i; j++) {
            for (int z = 0; z < dna[j].length; z++) {

                if (1 == dna[j][z]) {
                    count[j]++;
                    totalAmountOfOnes[j]++;
                    if (count[j] >= highestcountOfTheArray[j]) {
                        highestcountOfTheArray[j] = count[j];
                        digitsBeforeHighestSequence[j] = digits[j]-count[j]+1;
                    }
                    else if(count[j] == highestcountOfTheArray[j]) {
                        digits[j] = 0;
                    } else{

                    digits[j]++;}
                } else if (0 == dna[j][z]) {
                    count[j] = 0;
                    digits[j]++;
                }
            }
        }
//5
//1!0!1!1!0
//0!1!1!0!0
//Clone them!
        //deciding which is the bestDNA
        int sample = 0;
        for(int j = i-1; j>=0; j--){
            if (j != 0) {
                if (highestcountOfTheArray[j-1] > highestcountOfTheArray[j]) {
                    bestDNA = Arrays.copyOf(dna[j-1], dna[j-1].length);
                    sample = j-1;
                } else if (highestcountOfTheArray[j-1] == highestcountOfTheArray[j]){
                    if(digitsBeforeHighestSequence[j-1] < digitsBeforeHighestSequence[j]){
                        bestDNA = Arrays.copyOf(dna[j-1], dna[j-1].length);
                        sample = j-1;
                    } else if (digitsBeforeHighestSequence[j-1] == digitsBeforeHighestSequence[j]) {
                        if(totalAmountOfOnes[j-1]>totalAmountOfOnes[j]){
                            bestDNA = Arrays.copyOf(dna[j-1], dna[j-1].length);
                            sample = j-1;
                        }
                    }
                }
            }
        }

        //print bestDNA
        System.out.printf("Best DNA sample %d with sum: %d.%n", sample+1 , highestcountOfTheArray[sample]+1);
        for (int e : bestDNA) {
            System.out.print(e + " ");
        }
    }
}






