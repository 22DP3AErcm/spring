package rvt;

import static org.junit.Assert.fail;

public class Sort {
    
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }


    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        int second = array[index2];
        array[index1] = second;
        array[index2] = first;
        
    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
        }
    }

}
