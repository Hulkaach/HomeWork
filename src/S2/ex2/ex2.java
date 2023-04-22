package S2.ex2;
// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int num = scanner.nextInt();
        Random rnd = new Random();
        int[] array = new int[num];
        int count = 1;
        System.out.print("Массив целых чисел: ");
        
        for (int i = 0; i < array.length; i++) {
            // array[i] = i + 1;
            array[i] = rnd.nextInt(0, 10);
            System.out.print(array[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
        }

        if (count == array.length) {
            System.out.println("\nПоследовательность явлется возрастающей");
        } else
            System.out.println("\nПоследовательность не явлется возрастающей");

    }

}
