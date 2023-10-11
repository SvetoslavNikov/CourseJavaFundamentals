package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split(" ");
        int[] n = Arrays.stream(b).mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input;
        while (true) {
            input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            if (input.contains(" ")) {
                String[] inputArr = input.split(" ");
                int n1 = Integer.parseInt(inputArr[1]);
                int n2 = Integer.parseInt(inputArr[2]);

                if (input.contains("swap")) {
                    int temp = n1;
                    n[n1] = n[n2];
                    n[n2] = temp;

                } else if (input.contains("multiply")) {
                    n[n1] = n[n1] * n[n2];
                }

            }
            if (input.equals("decrease")) {
                for (int i = 0; i < b.length; i++) {
                    n[i] = n[i] - 1;
                }

            }
        }
        for(int e:n){
            System.out.print(e + ", ");
        }
    }
}
