package Day_16_17_Data_Structure_and_Algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] myArray = {5, 4, 6, 1, 2, 7, 8, 10, 9};
        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(myArray));
//        int returnedIndex = pivot(myArray, 0, myArray.length - 1);
//        System.out.println("Returned Index : " + returnedIndex);
//        System.out.println(Arrays.toString(myArray));
        quickSort(myArray);
        System.out.println("Quick Sorted Array : ");
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
