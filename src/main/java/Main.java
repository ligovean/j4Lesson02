import array.Array;
import array.ArrayImpl;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        Array<Integer> arr1 = new ArrayImpl<Integer>(1000000); //Задание 1. Создать массив большого размера (миллион элементов)
        Array<Integer> arr2 = new ArrayImpl<Integer>(1000000); //Задание 1. Создать массив большого размера (миллион элементов)
        Array<Integer> arr3 = new ArrayImpl<Integer>(1000000); //Задание 1. Создать массив большого размера (миллион элементов)

        //Задание 3. Заполнить массив случайными числами.
        for (int i = 0; i < 1000000; i++) {
            int rndInt = (int) (1000*Math.random());
            arr1.add(rndInt);
            arr2.add(rndInt);
            arr3.add(rndInt);
            //Более правильное решение для одинаково заполненных массивов: написать метод для класса ArrayImpl который бы на выход выдавал новый массив идентичный исходному.
        }

        //Задание 4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.

        long tStart = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        arr1.sortBubble();
        System.out.println("Время выполнения сортировки Методом пузырька(мс): " + (TimeUnit.NANOSECONDS.toMillis(System.nanoTime())-tStart));
        System.out.println();

        tStart = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        arr2.sortSelect();
        System.out.println("Время выполнения сортировки Методом выбора(мс): " + (TimeUnit.NANOSECONDS.toMillis(System.nanoTime())-tStart));
        System.out.println();

        tStart = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        arr3.sortInsert();
        System.out.println("Время выполнения сортировки Методом вставки(мс): " + (TimeUnit.NANOSECONDS.toMillis(System.nanoTime())-tStart));
    }
}
