package array;

import java.util.Arrays;

public class ArrayImpl<E> implements Array<E> {

    private E[] data;
    private int curSize;

    public ArrayImpl() {
        this(DEFAULT_LEN);
    }

    @SuppressWarnings("unchecked")
    public ArrayImpl(int initLen) {
        this.data = (E[]) new Object[initLen];
    }

    //Добавление нового элемента с увеличением размера массива
    public void add(E val) {
        if (curSize == data.length) {
            data = Arrays.copyOf(data, curSize * 2);
        }
        data[curSize++] = val;
    }

    //Удаление элемента по индексу
    public boolean removeByIndex(int val) {
        if (val>curSize || val<0) return false;
        for (int i = val; i < curSize; i++) {
            data[i] = data[i+1];
        }
        data[curSize]=null;
        curSize--;
        //if (curSize <= data.length/2) TODO Сокращение размера массива
        return true;
    }

    public boolean removeByValue(E val) {
        return false;
    }

    public boolean contains(Object val) {
        return false;
    }

    public int indexOf(Object val) {
        return 0;
    }

    public int len() {
        return curSize;
    }

    public int curSize() {
        return curSize;
    }

    public void display() {

        System.out.print("[");
        for (int i = 0; i < curSize; i++) {
            if (i==0) System.out.print(data[i]);
            else System.out.print(","+data[i]);
        }
        System.out.println("]");
    }

/* Метод дублирования массива ArrayImpl
    public Array<E> duplicateArray() {
        Array<E> arr = new ArrayImpl<E>();
        //TODO
        return arr;
    }*/

}
