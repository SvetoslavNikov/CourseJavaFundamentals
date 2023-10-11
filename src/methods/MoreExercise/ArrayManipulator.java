package methods.MoreExercise;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get the array of Integers
        int[] numbers;
        numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        final int numbersLength = numbers.length;


        while (true) {
            //input command

            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] inputArray = input.split(" ");

            if (input.contains("exchange")) {
                int a = printExchange(inputArray, numbersLength, numbers);
                if (a == 1) {
                    continue;
                }
            }


            //min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3

            // If there are two or more equal min/max elements, return the index of the rightmost one.

            // If a min/max even/odd element cannot be found, print "No matches".

            if (input.contains("even")) {

                //command min/max/first/last
                if (input.contains("max")) {
                    printMaxEven(numbersLength, numbers);
                } else if (input.contains("min")) {
                    printMinEven(numbersLength, numbers);
                } else if (input.contains("first")) {
                    printFirstEven(Integer.parseInt(inputArray[1]), numbers, numbersLength);
                } else if (input.contains("last")) {
                    printLastEven(Integer.parseInt(inputArray[1]), numbers, numbersLength);
                }

            } else if (input.contains("odd")) {

                //command min/max
                if (input.contains("max")) {
                    printMaxOdd(numbersLength, numbers);
                } else if (input.contains("min")) {
                    printMinOdd(numbersLength, numbers);
                } else if (input.contains("first")) {
                    printFirstOdd(Integer.parseInt(inputArray[1]), numbers, numbersLength);
                } else if (input.contains("last")) {
                    printLastOdd(Integer.parseInt(inputArray[1]), numbers, numbersLength);
                }

            }

        }
    }


    //o	If the count is greater than the array length, print "Invalid count".
    //o	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
    public static int printFirstEven(int count, int[] numbers, int numbersLength) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
            return 1;
        }

        StringBuilder result = new StringBuilder();
        result.append('[');

        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0 && count != 0) {
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append(numbers[i]);
                //System.out.print(numbers[i] + ", ");
                count--;
            }
        }
        result.append(']');
        System.out.println(result);

        return 0;
    }

    public static int printFirstOdd(int count, int[] numbers, int numbersLength) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
            return 1;
        }
        StringBuilder result = new StringBuilder();
        result.append('[');
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 1 && count != 0) {
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append(numbers[i]);
                count--;
            }
        }
        result.append("]");
        System.out.println(result);
        return 0;
    }

    public static int printLastEven(int count, int[] numbers, int numbersLength) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
            return 1;
        }
        StringBuilder result = new StringBuilder();
        result.append('[');
        for (int i = numbersLength - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0 && count != 0) {
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append(numbers[i]);
                count--;
            }
        }
        result.append(']');
        System.out.println(result);
        return 0;
    }

    public static int printLastOdd(int count, int[] numbers, int numbersLength) {
        if (count > numbers.length) {
            System.out.println("Invalid count");
            return 1;
        }
        StringBuilder result = new StringBuilder();
        result.append('[');

        for (int i = numbersLength - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 1 && count != 0) {
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append(numbers[i]);
                count--;
            }
        }

        result.append(']');
        System.out.println(result);
        return 0;
    }


    public static int printExchange(String[] inputArray, int numbersLength, int[] numbers) {
        //command exchange

        int index = Integer.parseInt(inputArray[1]);
        if (index > numbersLength - 1) {
            System.out.println("Invalid index");
            return 1;
        }
        int[] subarray = new int[numbersLength];
        for (int i = 0, j = index; i < numbersLength; i++, j++) {
            if (j < numbersLength) {
                subarray[i] = numbers[j];
            } else {
                j = 0;
                subarray[i] = numbers[j];
            }
        }
        for (int e : subarray) {
            System.out.print(e + " ");
        }
        System.out.println();
        return 0;
    }


    public static void printMaxEven(int numbersLength, int[] numbers) {
        int indexOfmax = Integer.MIN_VALUE;

        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0 && indexOfmax < numbers[i]) {
                indexOfmax = i;
            }
        }

        // повтаря се
        if (indexOfmax == Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(indexOfmax);
        }

    }

    public static void printMinEven(int numbersLength, int[] numbers) {

        int indexOfmin = Integer.MAX_VALUE;

        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0 && indexOfmin > numbers[i]) {
                indexOfmin = i;
            }
        }
        // повтаря се
        if (indexOfmin == Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(indexOfmin);
        }
    }


    public static void printMaxOdd(int numbersLength, int[] numbers) {
        int indexOfmax = Integer.MIN_VALUE;
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 1 && indexOfmax < numbers[i]) {
                indexOfmax = i;
            }
        }
        if (indexOfmax == Integer.MIN_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(indexOfmax);
        }
    }

    public static void printMinOdd(int numbersLength, int[] numbers) {
        int indexOfmin = Integer.MAX_VALUE;
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 1) {
                if (indexOfmin > numbers[i]) {
                    indexOfmin = i;
                }
            }
        }
        if (indexOfmin == Integer.MAX_VALUE) {
            System.out.println("No matches");
        } else {
            System.out.println(indexOfmin);
        }
    }


    //•	exchange {index} – splits the array after the given index and exchanges the places of the two resulting subarrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
    //o	If the index is outside the boundaries of the array, print "Invalid index".
    //•	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
    //•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
    //o	If there are two or more equal min/max elements, return the index of the rightmost one.
    //o	If a min/max even/odd element cannot be found, print "No matches".

    //•	end – stop taking input and print the final state of the array.

}



