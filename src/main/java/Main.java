import array.Array;
import array.ArrayImpl;


public class Main {
    public static void main(String[] args) {
        Array<Integer> arr1 = new ArrayImpl<Integer>();
        Array<Integer> arr2 = new ArrayImpl<Integer>();
        Array<Integer> arr3 = new ArrayImpl<Integer>();

        for (int i = 0; i < 10; i++) {
            int rndInt = (int) (1000*Math.random());
            arr1.add(rndInt);
            arr2.add(rndInt);
            arr3.add(rndInt);
        }


        System.out.println("Размер массива 1: " + arr1.len());
        arr1.display();
        System.out.println("Удаление 3-го элемента Массива 1: " + arr1.removeByIndex(3));

        System.out.println("Размер Массива 1: " + arr1.len());
        arr1.display();

        System.out.println("Удаление 10-го элемента Массива 1: " + arr1.removeByIndex(10));

        System.out.println("Размер массива 2: " + arr2.len());
        arr2.display();

    }
}
