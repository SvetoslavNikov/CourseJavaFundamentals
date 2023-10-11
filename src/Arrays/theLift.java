package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        int people = Integer.parseInt(scan.nextLine());
        String b = scan.nextLine();
        String[] c = b.split(" ");
        int[] seats = Arrays.stream(c).mapToInt(value -> Integer.parseInt(value)).toArray();

        //placing people to seats
        boolean emptySeats = false;
        outerloop:
        for (int i = 0; i < c.length; i++) {
            for (int j = seats[i]; j < 4; j++) {
                seats[i]++;
                people--;
                if(people<=0){
                    if(seats[i]<4){
                        emptySeats = true;
                    }
                    break outerloop;
                }
            }

        }

        //print result
        if(people>0){
            System.out.printf("There isn't enough space! %d people in a queue!\n",people);
        }
        else if (emptySeats){
            System.out.println("The lift has empty spots!");
        }
        for(int e:seats){
            System.out.print(e+" ");
        }

    }
}
        //max4


