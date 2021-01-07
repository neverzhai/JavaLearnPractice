package charpter8;

public class PairWithDiffType<T extends Comparable, S extends Comparable> {
    private T first;
    private S secondl;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return secondl;
    }

    public void setSecondl(S secondl) {
        this.secondl = secondl;
    }

    public PairWithDiffType(T first, S secondl) {
        this.first = first;
        this.secondl = secondl;
    }
}
