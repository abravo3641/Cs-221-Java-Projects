//Anthony Bravo
//Cs 221 Assignment #4

public class AnthonyBravo_A4_GenericSelectionSort {
    public <T extends Comparable<T>> void selectionSort(T[] array){

        for(int i = 0; i < array.length - 1; i++) {
            int smallest = i;

            for(int index = i + 1; index < array.length; index++) {
                if(array[index].compareTo(array[smallest]) < 0)
                    smallest = index;
            }
            swap(array, i, smallest);
        }
    }

    public <T extends Comparable<T>> void swap(T[] array, int first, int second) {
        T temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }
}
