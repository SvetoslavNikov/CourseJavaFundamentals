package Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;


public class mixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ls1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> ls2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0, j = ls2.size() - 1; i < ls1.size() && j >= 0; i++, j--) {
            resultList.add(ls1.get(i));
            resultList.add(ls2.get(j));
        }

        int start = 0;
        int end = 0;

        if (ls1.size() > ls2.size()) {
            start = ls1.get(ls1.size() - 2);
            end = ls1.get(ls1.size() - 1);
        } else {
            start = ls2.get(0);
            end = ls2.get(1);
        }

        int change;
        if(start>end){
            change = start;
            start = end;
            end = change;
        }
        Collections.sort(resultList);
        for (int i : resultList) {

            if (i > start && i < end) {
                System.out.printf("%d ", i);
            }
        }
    }
}
//1 5 23 64 2 3 34 54 12
//43 23 12 31 54 51 92

























