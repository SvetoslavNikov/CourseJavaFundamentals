package Lists.Exercise;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        // 10 20 30
        // 5 20 30

        // 20 30 10 5
        // 20 30

        while (true) {
            if (firstHand.get(0) > secondHand.get(0)) {
                firstHand.add(firstHand.get(0));
                firstHand.remove(0);
                firstHand.add(secondHand.get(0));
                secondHand.remove(0);
            } else if (firstHand.get(0) < secondHand.get(0)) {
                secondHand.add(secondHand.get(0));
                secondHand.remove(0);
                secondHand.add(firstHand.get(0));
                firstHand.remove(0);
            } else {
                secondHand.remove(0);
                firstHand.remove(0);
            }
            if (secondHand.size() == 0) {
                int summed = firstHand.stream().mapToInt(Integer::intValue).sum();

                System.out.printf("First player wins! Size: %d%n", summed);
                break;
            } else if (firstHand.size() == 0) {
                int summed = secondHand.stream().mapToInt(Integer::intValue).sum();

                System.out.printf("Second player wins! Size: %d%n", summed);
                break;
            }
        }
    }
}
