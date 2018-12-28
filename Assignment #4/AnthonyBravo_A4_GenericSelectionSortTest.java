//Anthony Bravo
//Cs 221 Assignment #4

import java.util.Arrays;
import java.util.Scanner;

public class AnthonyBravo_A4_GenericSelectionSortTest {
    public static void main(String[] args) {
        AnthonyBravo_A4_GenericSelectionSort genSort = new AnthonyBravo_A4_GenericSelectionSort();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int length = input.nextInt();

        Integer[] int_array = new Integer[length];
        Float[] float_array = new Float[length];

        //Validate input
        boolean done = false;
        do {
            try {
                System.out.print("Enter " + length + " integers to sort:");
                for (int i = 0; i < length; i++)
                    int_array[i] = input.nextInt();

                System.out.print("Enter " + length + " floats to sort:");
                for (int i = 0; i < length; i++)
                    float_array[i] = input.nextFloat();
                done = true;
            } catch (Exception e) {
                System.out.println("Error try again");
                input.next();
            }
        }while(!done);

        System.out.println("\nIntegers to be sorted: " + Arrays.toString(int_array));
        genSort.selectionSort(int_array);
        System.out.println("Sorted Integers: " + Arrays.toString(int_array));

        System.out.println();

        System.out.println("Floats to be sorted: "+Arrays.toString(float_array));
        genSort.selectionSort(float_array);
        System.out.print("Sorted Floats: " + Arrays.toString(float_array));
        
        System.out.println();
    }
}
