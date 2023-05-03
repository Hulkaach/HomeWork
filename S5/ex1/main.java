package HomeWork.S5.ex1;

import java.util.HashMap;
import java.util.Map;

public class main {
    /**
     * Подсчитать количество искомого слова, через map (наполнением значение, где
     * искомое слово будет являться ключом), вносить все слова не нужно
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * Запрос: Россия
     * Ответ: Россия - 2
     * toLoverCase().
     * 
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        System.out.println(str);
        str = str.replace(".", " ");
        String[] words = str.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        
        String findWord = "Россия";
        String lowerWord = findWord.toLowerCase();
        System.out.println(findWord + " - " + map.get(lowerWord));
    }
}
