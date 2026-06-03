package Day_16_17_Data_Structure_and_Algorithm.search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21, 21};
        int target = 11;
        boolean isPresent = linearSearch(array, target);
        System.out.println(target + " " + isPresent);
    }

    private static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return true;
        }
        return false;
    }
}
