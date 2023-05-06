package Sorting;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 6, 1, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    
    //swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;        
    }
}
