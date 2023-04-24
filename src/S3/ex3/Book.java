package S3.ex3;

public class Book {
    String name;
    String surnameAuthor;
    Double cost;
    Integer year;
    Integer page;

    public Book(String name, String surnameAuthor, Double cost, Integer year, Integer page) {
        this.name = name;
        this.surnameAuthor = surnameAuthor;
        this.cost = cost;
        this.year = year;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", surnameAuthor=" + surnameAuthor + ", cost=" + cost + ", year=" + year
                + ", page=" + page + "]";
    }   
    
}
