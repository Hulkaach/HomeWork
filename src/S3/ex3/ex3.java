package S3.ex3;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    /**
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» 
     * и год издания после 2010 г, включительно.
     * @param args
     */
    public static void main(String[] args) {
        List<Book> books = NewBook();

        System.out.println("Исходные данные: ");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Сортированные данные: ");
        for (Book book : books) {
            if (book.surnameAuthor.contains("A") && book.year >= 2010 && isPrime(book.page)) {
                System.out.println(book);
            }
        }
    }

    public static Boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Book> NewBook() {
        List<Book> book = new ArrayList<Book>();
        book.add(new Book("Book1", "Author1", 1263.12, 2010, 347));
        book.add(new Book("Book2", "Author2", 9123.12, 2000, 347));
        book.add(new Book("Book3", "uthor1", 1123.12, 2011, 347));
        book.add(new Book("Book4", "Author1", 123.12, 2012, 200));
        book.add(new Book("Book5", "Author1", 1233.12, 2010, 13));
        book.add(new Book("Book6", "Author1", 23.12, 2020, 500));

        return book;
    }
}
