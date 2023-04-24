package S3.ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ex2 {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены,
     * сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<Goods> goods = GetGoods();
        System.out.println("Исходные данные: ");
        for (Goods x : goods) {
            System.out.println(x);
        }
        System.out.println("Товары с наименьшнй ценой: " + GetName(goods));
    }

    public static Collection GetName(List<Goods> goods) {
        List<String> array = new ArrayList<>();
        Double minCost = goods.get(0).cost;
        for (Goods item : goods) {
            if (item.variety.contains("высший")) {
                for (Goods name2 : goods) {
                    if (name2.cost < minCost && name2.name == item.name) {
                        minCost = item.cost;
                        array.add(item.name);
                    }
                }
            }
        }
        return array;
    }

    public static List<Goods> GetGoods() {
        List<Goods> goods = new ArrayList<Goods>();
        goods.add(new Goods("Товар1", "Россия", 0.50, 500.0, "высший"));
        goods.add(new Goods("Товар2", "Россия", 1.00, 120.6, "высший"));
        goods.add(new Goods("Товар1", "Белоруссия", 0.50, 210.0, "высший"));
        goods.add(new Goods("Товар2", "Белоруссия", 0.50, 220.0, "высший"));
        goods.add(new Goods("Товар5", "Казахстан", 0.90, 50.0, "1-й сорт"));
        return goods;
    }
}
