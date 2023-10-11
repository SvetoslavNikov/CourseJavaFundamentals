//see bif there is horter solution in the leecture
package Lists.Lab;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class mergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//int n = Integer.parseInt(scanner.nextLine());
//double n = Double.parseDouble(scanner.nextLine());
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        List<Integer> numbers1 = new ArrayList<>(Arrays.stream(s1.split(" ")).map(Integer::parseInt).toList());
        List<Integer> numbers2 = new ArrayList<>(Arrays.stream(s2.split(" ")).map(Integer::parseInt).toList());
        List<Integer> finalList = new ArrayList<>();

        int smallerList;
        if (numbers2.size() < numbers1.size()) {
            smallerList = numbers2.size();

        } else {
            smallerList = numbers1.size();
        }
        int j = 0;
        int z = 0;
        for (int i = 0; i < 2*smallerList; i++) {
            if(i%2 == 0){
                finalList.add(numbers1.get(j));
                j++;
            }else {
                finalList.add(numbers2.get(z));
                z++;
            }
        }

        if(numbers2.size() < numbers1.size()){
            for (int i = j; i < numbers1.size(); i++) {
                finalList.add(numbers1.get(i));
            }
        } else{
            for (int i = z; i < numbers1.size(); i++) {
                finalList.add(numbers1.get(i));
            }
        }
        System.out.println(finalList);
//for(int i = 0; i<n; n++){
    }
}
