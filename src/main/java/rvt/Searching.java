package rvt;


public class Searching {
    public static int binarySearch(int[] array, int searchedId){
        Sort.sort(array);
        int start = 0;
        int end = array.length - 1;
        int middle = 0;
        while(start <= end){
            middle = (start + end) / 2;
            if(array[middle] == searchedId){
                return middle;
            }
            if(array[middle] < searchedId){
                start = middle + 1;
            }
            if(array[middle] > searchedId){
                end = middle - 1;
            }
        }
        return -1;
    }
}
