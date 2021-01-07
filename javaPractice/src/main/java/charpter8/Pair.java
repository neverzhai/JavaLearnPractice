package charpter8;

import java.util.function.Supplier;

public class Pair<T extends Comparable> {
    private T first;
    private T second;

    public static <T extends Comparable> Pair<T> makePair(Supplier<T> constr) {
     return new Pair<>(constr.get(), constr.get());
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }
}
