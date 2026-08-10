// Program to demonstrate Multilevel Inheritance.

// Book → BookInfo → BookSales classes are used to calculate and display book sales details.

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    int price;
    int stock;
}

class BookSales extends BookInfo {
    int copiesSold;

    void RevenueGenerated() {
        int revenue = price * copiesSold;
        System.out.println("Revenue Generated: " + revenue);
    }

    void AllShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Copies Sold: " + copiesSold);
        RevenueGenerated();
    }
}

public class code2 {
    public static void main(String[] args) {

        BookSales b = new BookSales();

        b.author = "J.K. Rowling";
        b.title = "Harry Potter";
        b.publisher = "Bloomsbury";
        b.price = 500;
        b.stock = 20;
        b.copiesSold = 100;

        b.AllShow();
    }
}