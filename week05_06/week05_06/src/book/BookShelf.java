package book;

public class BookShelf {
    public static void main(String[] args){
        // Instantiate and initialize several Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        // Output initial information about the books
        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);

        // Update the title of book1
        book1.setTitle("The Catcher in the Rye");
        System.out.println("\nUpdated Book 1:\n" + book1);
    }
}


