package array;

public interface Array<E> {

    static final int DEFAULT_LEN = 16;

    void add(E val);
    boolean removeByIndex(int val);
    boolean removeByValue(E val);
    boolean contains(E val);
    int indexOf(E val);
    int len();
    void display();
}
