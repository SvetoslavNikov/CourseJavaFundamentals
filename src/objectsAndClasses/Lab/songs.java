package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        List<song> songs = new ArrayList<>();



        for(int i = 0; i<n; i++){
            String[] inputArr = scanner.nextLine().split("_");

            song gosho = new song(inputArr[0], inputArr[1], inputArr[2]);

            songs.add(gosho);
        }

        String type = scanner.nextLine();
        for (song s:songs) {
            if(s.getTypeList().equals(type) || type.equals("all")){
            System.out.println(s.getName());}
        }


    }
}
//favourite_DownTown_3:14
//favourite_Kiss_4:16
//favourite_Smooth Criminal_4:01
//favourite

