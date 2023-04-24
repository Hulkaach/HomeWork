package S3.ex1;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    /**
     * Дан массив записей: наименование товара, цена, сорт. 
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, 
     * название которых содержит «высший».
     * @param args
     */

    public static void main(String[] args) {
        List<Products> products = GetProduct(); 
        System.out.println("Исходные данные: ");
        for (Products product : products) {
            System.out.println(product);            
        }  
        
        float maxPrice = 0; 

        for (Products product : products) {
            if (product.name.contains("высший") && product.variety == 1 || product.variety == 2){
                if (maxPrice < product.cost){
                    maxPrice = product.cost;
                } 
            }                       
        }

        System.out.println("Наибольшая цена товаров 1-го или 2-го сорта с названием 'высший': " + maxPrice); 
            
        }
        public static List<Products> GetProduct() {
            List<Products> products = new ArrayList<Products>();
            products.add(new Products("Мука высший сорт", 48.5f, 1));
            products.add(new Products("Мука высший сорт", 68.5f, 1));
            products.add(new Products("Молоко коровье", 60.0f, 2));
            products.add(new Products("Cоль", 12.5f, 3));
            products.add(new Products("Таранка", 99.9f, 3));
            products.add(new Products("Картошка", 55.2f, 3));
            return products;
    }
}
