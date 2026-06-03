package Day_16_17_Data_Structure_and_Algorithm.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21};
        int target = 11;
        boolean isPresent = binarySearch(array, target);
        System.out.println(target + " " + isPresent);
    }

    public static boolean binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) return true;
            else if (target < array[mid]) end = mid - 1;
             else if (target > array[mid]) start = mid + 1;
        }
        return false;
    }
}
