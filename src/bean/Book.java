package bean;

import java.security.PublicKey;

/**
 * @Auther: Spagirist
 * @Date: 2019/8/15
 * @Descsctiotion: bean
 * @version: 1.0
 */
public class Book {

    private static String id;
    private static String ISBN;
    private static String name;
    private static Category category;
    private static int store;
    private static double price;
    private static String author;

    public Book(String id, String ISBN, String name, Category category, int store, double price, String author) {
        this.id = id;
        this.ISBN = ISBN;
        this.name = name;
        this.category = category;
        this.store = store;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static String List() {
        return
                "id='" + id + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +'\'' +
                ", price=" + price +'\'' +
                ", author='" + author + '\'' ;

    }

    public static  void minusS(){
        store--;
    }

    public static  void addS(){
        store++;
    }
}
