package S4.ex1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1->2->3->4
     * Вывод:
     * 4->3->2->1
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введи количество элементов: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println(Massiv(count));
        System.out.println(ReverseMassiv(Massiv(count)));

        // System.out.println(inArm(count)); // Ручной ввод через Stack
    }

    public static Deque<Integer> Massiv(int num) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i < num + 1; i++) {
            deque.add(i);
        }
        return deque;
    }

    public static Deque<Integer> ReverseMassiv(Deque<Integer> dq) {
        Deque<Integer> reverseArr = new ArrayDeque<>();
        for (int i = 0; i < dq.size(); i++) {
            reverseArr.add(dq.removeLast());
            i--;
        }
        return reverseArr;
    }

    // Ручной ввод через Stack
    // public static Stack<Integer> inArm(int count) {
    // Scanner scanner = new Scanner(System.in);
    // Stack<Integer> list1 = new Stack<Integer>();
    // Stack<Integer> list2 = new Stack<Integer>();
    // for (int i = 0; i < count; i++) {
    // System.out.print("Введи " + (i + 1) + " элемент: ");
    // list1.push(scanner.nextInt());
    // }
    // System.out.println("Исходные данные: ");
    // System.out.println(list1);

    // System.out.println("В обратном порядке: ");
    // for (int i = 0; i < count; i++) {
    // list2.add(list1.pop());
    // }
    // return (list2);
    // }

}
