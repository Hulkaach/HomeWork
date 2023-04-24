package S3.ex2;

public class Goods {
    String name;
    String country;
    Double weight;
    Double cost;
    String variety;
    
    public Goods(String name, String country, Double weight, Double cost, String variety) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.cost = cost;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Goods [name=" + name + ", country=" + country + ", weight=" + weight + ", cost=" + cost + ", variety="
                + variety + "]";
    }

}
