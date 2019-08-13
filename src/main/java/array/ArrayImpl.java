package array;

import java.util.Arrays;
import java.util.Objects;



public class ArrayImpl<E extends Object & Comparable<? super E>> implements Array<E> {

    private E[] data;
    private int curSize;

    public ArrayImpl() {
        this(DEFAULT_LEN);
    }

    @SuppressWarnings("unchecked")
    public ArrayImpl(int initLen) {
        this.data = (E[]) new Object[initLen];
    }

    //Задание 2. Написать методы удаления, добавления, поиска элемента массива.

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
        data[--curSize]=null;

        //if (curSize <= data.length/2) TODO Сокращение размера массива
        return true;
    }

    //Удаление элемента по содержимому
    public boolean removeByValue(E val) {
        int index = indexOf(val);
        return removeByIndex(index);
    }

    //Проверка на присутствие в массиве по содержимому
    public boolean contains(E val) {
        return indexOf(val) != -1;
    }

    //Возврещение индекса по содержимому
    public int indexOf(E value) {
        for (int i = 0; i < curSize; i++) {
            if (Objects.equals(value, data[i])) {
                return i;
            }
        }
        return -1;
    }

    //Текущая длинна массива
    public int len() {
        return curSize;
    }

    //Печать массива в строку

    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < curSize; i++) {
            if (i==0) result += data[i];
            else result += ","+data[i];
        }
        result +="}";
        return result;
    }

    //Вывод массива на экран
    public void display() {
        System.out.println(this.toString());
    }

/* Метод дублирования массива ArrayImpl
    public Array<E> duplicateArray() {
        Array<E> arr = new ArrayImpl<E>();
        //TODO
        return arr;
    }*/

//Задание 4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
//===================МЕТОДЫ СОРТИРОВКИ==============
    //реализация Метода пузырька
    public void sortBubble() {
        for (int i = 0; i < curSize - 1; i++) {
            for (int j = 0; j < curSize - 1 - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    //реализация Метода выбора
    public void sortSelect() {
        for (int i = 0; i < curSize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < curSize; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(minIndex, i);
        }
    }

    //реализация Метода вставки
    public void sortInsert() {
        for (int i = 1; i < curSize; i++) {
            E temp = data[i];
            int in = i;
            while (in > 0 && data[in - 1].compareTo(temp) > 0) {
                data[in] = data[in - 1];
                in--;
            }
            data[in] = temp;
        }
    }

    //Замена элементов
    private void swap(int index1, int index2) {
        E temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

}
