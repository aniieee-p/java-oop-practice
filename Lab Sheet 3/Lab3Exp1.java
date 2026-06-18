class Book {
    String title;
    String author;
    Double price;

    public Book(String title, String author, Double price) {
        if (title != null && author != null && price > 0) {
            this.title = title;
            this.author = author;
            this.price = price;
        } else {
            System.out.println("Invalid input");
        }
    }
    
    public void displayDetails() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
    }
}

public class Lab3Exp1 {
    public static void main (String[] args) {
        Book b1 = new Book("Java Basics", "pratham", 450.50);
        b1.displayDetails();
    }
}