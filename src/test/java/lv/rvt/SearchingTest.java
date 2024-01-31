package lv.rvt;

import org.junit.Test;
import rvt.Searching;
import static org.junit.Assert.assertEquals;

public class SearchingTest {
    @Test
    public void binarySearch() {
        int[] array = { 8, 3, 7, 9, 1, 2, 4, 50, -100, 0, 20, 400, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007};
        int searchedId = 1000;
        int result = Searching.binarySearch(array, searchedId);
        assertEquals(12, result);
    }
}
