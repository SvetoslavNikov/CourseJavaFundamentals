package Lists;


import java.util.*;

public class PresentationTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        //double n = Double.parseDouble(scanner.nextLine());
        //String s = scanner.nextLine();
        //for(int i = 0; i<n; n++){
        /*List<String> names;
        names = new ArrayList<>();
        names.add("Sofia");
        names.add("Svetoslav");
        names.add("Ivailov");
        names.add("Nikov");
        boolean sofia = names.remove("Sofia");
        boolean nasko = names.remove("Nasko");
       String index = names.remove(1);
        for (int i = 0; names.size() > i; i++) {

            System.out.println(names.get(i));
        }
        System.out.println(names);
        System.out.println(sofia);
        System.out.println(nasko);
        System.out.println(index);



        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(20, 30 , 40 , 50));
        numbers.remove(1);
        numbers.remove(Integer.valueOf(20));
        numbers.add(1, 45);
        System.out.println(numbers);
        String values = scanner.nextLine();
        List<String> valuesList = new ArrayList<>();
        valuesList = Arrays.stream(values.split(" ")).toList();
        for(String s: valuesList){
            System.out.println(s);
        }

        String numbers = scanner.nextLine();
        List<Integer> numbersList = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        for(int s: numbersList){
            System.out.println(s);
        }*/


        List<String> names = new ArrayList<>(Arrays.asList("Ana","Gati", "Babe", "Yoana"));
        Collections.sort(names);
        Collections.reverse(names);
        System.out.println(names);

        int[] a = {1, 2, 3, 9 , 8 , 7};
        Arrays.sort(a);
        for(int e: a) {
            System.out.println(e);
        }





    }
}


























