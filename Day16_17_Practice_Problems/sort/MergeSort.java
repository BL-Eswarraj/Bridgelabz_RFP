package Day_16_17_Data_Structure_and_Algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 3, 9, 7, 8};

        System.out.print("Original order : ");
        System.out.println(Arrays.toString(array));

        int[] mergeArray = mergeSort(array);
        System.out.print("Merge Sort order : ");
        System.out.println(Arrays.toString(array));
    }

    private static int[] mergeSort(int[] array) {
        if(array.length == 1) return array;
        int mid=array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {

        int[] combine = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                combine[index]=left[i];
                index++;
                i++;
            }else{
                combine[index]=right[j];
                index++;
                j++;
            }
        }
        while(i<left.length){
            combine[index]=left[i];
            index++;
            i++;
        }
        while(j<right.length){
            combine[index] = right[j];
            index++;
            j++;
        }
    return combine;
    }


}
