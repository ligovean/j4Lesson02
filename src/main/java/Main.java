import array.Array;
import array.ArrayImpl;


public class Main {
    public static void main(String[] args) {
        Array<Integer> arr1 = new ArrayImpl<Integer>();
        for (int i = 0; i < 10; i++) {
            arr1.add((int) (1000*Math.random()));
        }


        System.out.println("Размер массива: " + arr1.len());
        arr1.display();
        System.out.println("Удаление 3-го элемента массива: " + arr1.removeByIndex(3));

        System.out.println("Размер массива: " + arr1.len());
        arr1.display();

        System.out.println("Удаление 10-го элемента массива: " + arr1.removeByIndex(10));

        Array<Integer> arr2 = new ArrayImpl<Integer>();
        //arr1.duplicateArray(arr2);

    }
}
