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
            //Более правильное решение для одинаково заполненных массивов: написать метод для класса ArrayImpl который бы на выход выдавал новый массив идентичный исходному.
        }

        System.out.println("Массив 1: " + arr1.toString());
        System.out.println("Массив 2: " + arr2.toString());
        System.out.println("Массив 3: " + arr3.toString());
    }
}
