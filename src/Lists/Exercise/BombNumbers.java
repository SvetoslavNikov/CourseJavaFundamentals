package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String bomb = scanner.nextLine();
        int[] bombArr = Arrays.stream(bomb.split(" "))
                .mapToInt(Integer::parseInt).toArray();


        List<Integer> indexToBomb = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(bombArr[0] == numbers.get(i)){
                for (int j = i - bombArr[1]; j < bombArr[1]+i+1; j++) {
                    indexToBomb.add(j);
                }
            }
        }

        Collections.sort(indexToBomb, Collections.reverseOrder());

        for (int index:indexToBomb) {
            numbers.remove(index);
        }
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}

