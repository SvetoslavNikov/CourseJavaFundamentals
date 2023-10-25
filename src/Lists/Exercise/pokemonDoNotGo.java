package Lists.Exercise;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class pokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (true) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index == 0) {
                break;
            }
        }

        int summedList = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(summedList);
    }
}
