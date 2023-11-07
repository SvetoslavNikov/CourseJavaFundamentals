package Lists.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class carRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//input odd %2 == 1 array of numbers\

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double timeLeft = 0;
        double timeRight = 0;
        int finishIndex = numbers.length / 2;

        //calculate the total time for each racer to reach the middle of the array
        for (int i = 0; i < finishIndex; i++) {
            if (numbers[i] == 0) {
                timeLeft *= 0.8;
            } else {
                timeLeft += numbers[i];
            }
        }

        for (int i = numbers.length - 1; i > finishIndex; i--) {
            if (numbers[i] == 0) {
                timeRight *= 0.8;
            } else {
                timeRight += numbers[i];
            }
        }

        //print the winner
        double time = 0;
        String winner = "";

        if (timeRight < timeLeft) {
            winner = "right";
            time = timeRight;

        } else {
            winner = "left";
            time = timeLeft;
        }


            System.out.printf("The winner is %s with total time: %.1f", winner, time);
        }
    }
