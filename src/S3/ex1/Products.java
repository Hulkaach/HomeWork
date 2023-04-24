package S3.ex1;

public class Products {
    String name;
    Float cost;
    Integer variety;
    
    public Products(String name, Float cost, Integer variety) {
        this.name = name;
        this.cost = cost;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Products [name=" + name + ", cost=" + cost + ", variety=" + variety + "]";
    }   
}
