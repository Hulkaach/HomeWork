package HomeWork.S5.ex2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class main {
    /**
     * Пусть дан список сотрудников:
     * Написать программу, которая найдёт и выведет повторяющиеся имена с
     * количеством повторений. Отсортировать по убыванию популярности.
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов");

        for (String string : list) {
            System.out.println(string);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            map.put(string.split(" ")[0], map.getOrDefault(string.split(" ")[0], 0) + 1);

        }

        System.out.println(map.entrySet());
        int max = 1;
        for (int value : map.values()) {
            if (max < value) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (var item : map.entrySet())
                if (map.get(item.getKey()) == i)
                    System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
