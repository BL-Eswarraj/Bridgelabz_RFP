package Day_13_Practice_Problem;

public class MaxNumber {

    // UC1 - Integer max
    public static int maxInt(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    // UC2 - Float max
    public static float maxFloat(float a, float b, float c) {
        float max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    // UC3 - String max
    public static String maxString(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;

        return max;
    }

    // Refactor - Generic method
    public static <T extends Comparable<T>> T maxValue(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;

        return max;
    }

    // UC4 - Max of more than 3 values (Varargs)
    public static <T extends Comparable<T>> T max(T... values) {
        T max = values[0];

        for (T v : values) {
            if (v.compareTo(max) > 0) {
                max = v;
            }
        }
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }


    public static void main(String[] args) {

        System.out.println("===== Testing Integer Max =====");
        System.out.println("Max of (50, 20, 10)  → " + maxInt(50, 20, 10));
        System.out.println("Max of (10, 40, 20)  → " + maxInt(10, 40, 20));
        System.out.println("Max of (10, 20, 70)  → " + maxInt(10, 20, 70));


        System.out.println("\n===== Testing Float Max =====");
        System.out.println("Max of (4.5f, 2.3f, 1.1f) → " + maxFloat(4.5f, 2.3f, 1.1f));
        System.out.println("Max of (1.2f, 9.8f, 3.5f) → " + maxFloat(1.2f, 9.8f, 3.5f));
        System.out.println("Max of (2.5f, 4.4f, 8.8f) → " + maxFloat(2.5f, 4.4f, 8.8f));


        System.out.println("\n===== Testing String Max =====");
        System.out.println("Max of (Apple, Peach, Banana) → " + maxString("Apple", "Peach", "Banana"));
        System.out.println("Max of (Dog, Cat, Elephant)   → " + maxString("Dog", "Cat", "Elephant"));
        System.out.println("Max of (AAA, BBB, AAB)        → " + maxString("AAA", "BBB", "AAB"));


        System.out.println("\n===== Testing Generic Method =====");
        System.out.println("Generic Max (10, 20, 30) → " + maxValue(10, 20, 30));
        System.out.println("Generic Max (2.2, 9.9, 5.5) → " + maxValue(2.2, 9.9, 5.5));
        System.out.println("Generic Max (Car, Bike, Plane) → " + maxValue("Car", "Bike", "Plane"));


        System.out.println("\n===== Testing Generic Class =====");
        MaxGenericClass<Integer> intObj = new MaxGenericClass<>(15, 35, 25);
        System.out.println("Generic Class Max Integer → " + intObj.findMax());

        MaxGenericClass<String> strObj = new MaxGenericClass<>("Banana", "Apple", "Peach");
        System.out.println("Generic Class Max String → " + strObj.findMax());


        System.out.println("\n===== Testing UC4: More than 3 Values =====");
        System.out.println("Max of (10, 50, 20, 90, 5) → " + max(10, 50, 20, 90, 5));
        System.out.println("Max of (3.3, 7.7, 1.1, 9.9) → " + max(3.3, 7.7, 1.1, 9.9));


        System.out.println("\n===== Testing UC5: printMax =====");
        printMax(maxValue(45, 30, 10));
        printMax(maxValue("AAA", "ZZZ", "MMM"));
    }
}
