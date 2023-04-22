package S2.ex1;

import java.util.Scanner;

// Дана последовательность N целых чисел. Найти сумму простых чисел.

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime == true) {
                sum += i;

            }

        }
        System.out.print("Сумма простых чисел равна ");
        System.out.println(sum);
    }
}
