// Program to demonstrate Single Level Inheritance.
// Base class Book is inherited by BookInfo to display book details.

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    int price;
    int stock;

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println();
    }
}

public class code1 {
    public static void main(String[] args) {

        BookInfo b1 = new BookInfo();
        b1.author = "Janamejay Deval";
        b1.title = "The Higher Side";
        b1.publisher = "Self Published";
        b1.price = 499;
        b1.stock = 10;

        BookInfo b2 = new BookInfo();
        b2.author = "J.K. Rowling";
        b2.title = "Harry Potter";
        b2.publisher = "Bloomsbury";
        b2.price = 500;
        b2.stock = 20;

        BookInfo b3 = new BookInfo();
        b3.author = "Ashwin Sanghi";
        b3.title = "The Krishna Key";
        b3.publisher = "Westland";
        b3.price = 400;
        b3.stock = 15;

        b1.show();
        b2.show();
        b3.show();
    }
}