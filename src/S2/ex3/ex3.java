package S2.ex3;

import java.util.Random;
import java.util.Scanner;

// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int num = scanner.nextInt();
        int[] arr2 = createArray(num);
        findSumIndex(arr2);
        changeArray(arr2, findSumIndex(arr2));

    }

    public static int[] createArray(int n) {
        System.out.print("Исходный массив: ");
        Random rnd = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(-10, 30);
            System.out.print(" " + array[i]);
        }
        return array;
    }

    public static int findSumIndex(int[] array) {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) >= 10 && Math.abs(array[i]) < 100) {
                sumIndex += i;
            }
        }
        return sumIndex;
    }

    public static int[] changeArray(int[] arr1, int sumIndex) {
        System.out.print("\nСкорректированный массив: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 0) {
                arr1[i] = sumIndex;

            }
            System.out.print(" " + arr1[i]);
        }
        return arr1;
    }
}

// int sumIndex = 0;
// for (int j = 0; j < arr1.length; j++) {
// if (arr1[j] >= 10 && arr1[j] <= 100) {
// sumIndex += j;