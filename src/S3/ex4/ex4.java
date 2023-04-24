package S3.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ex4 {
    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
     * среднее из этого списка.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < random.nextInt(10, 20); i++) {
            list.add(random.nextInt(1, 10));
        }

        System.out.println("Исходные данные: ");
        for (Integer i : list) {
            System.out.printf(" " + i);
        }

        int minValue = Collections.min(list);
        System.out.println("\nMin - " + minValue);
        System.out.println("Max - " + Collections.max(list));
        System.out.println("Median - " + Median(list) / list.size());

    }

    public static float Median(List<Integer> argList) {
        float sum = 0;
        for (Integer i : argList) {
            sum += i;
        }
        return sum;
    }
}
