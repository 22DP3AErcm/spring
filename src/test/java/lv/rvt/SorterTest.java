package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;
import rvt.Sort;

public class SorterTest {
    
    
    @Test
    public void smallest() {
        int[] array = { 8, 3, 7, 9, 1, 2, 4 };
        int smallest = Sort.smallest(array);
        
        
        assertEquals(1, smallest);
    }
    @Test
    public void smallestIndex() {
        int[] array = { 8, 3, 7, 9, 1, 2, 4 };
        int smallest = Sort.indexOfSmallest(array);
        
        
        assertEquals(4, smallest);
    }
    @Test
    public void smallestIndexFrom() {
        int[] array = { 8, 3, 7, 9, 1, 2, 4 };
        int smallest = Sort.indexOfSmallestFrom(array, 2);
    
        assertEquals(4, smallest);
    }
    @Test
    public void swap() {
        int[] array = { 3, 2, 5, 4, 8 };
        Sort.swap(array, 1, 0);

        assertEquals(2, array[0]);
        assertEquals(3, array[1]);
    }
    @Test
    public void sort() {
        int[] array = { 8, 3, 7, 9, 1, 2, 4 };
        Sort.sort(array);
        
        assertEquals("[1, 2, 3, 4, 7, 8, 9]", Arrays.toString(array));
    }
}
