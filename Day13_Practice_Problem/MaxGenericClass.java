package Day_13_Practice_Problem;

public class MaxGenericClass <T extends Comparable<T>>{
    private T a, b, c;

    public MaxGenericClass(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T findMax() {
        return MaxNumber.maxValue(a, b, c);
    }
}
