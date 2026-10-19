package Home;

public class BookRunner {
    public static void main(String[] args) {
        book book1 = new book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        book book2 = new book("To Kill a Mockingbird", "Harper Lee", "Fiction");
        book book3 = new book("1984", "George Orwell", "Dystopian");
        book book4 = new book("Pride and Prejudice", "Jane Austen", "Romance");
        book book5 = new book("The Catcher in the Rye", "J.D. Salinger", "Fiction");
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);
        System.out.println("Book 4: " + book4);
        System.out.println("Book 5: " + book5);
        book1.getTitle();
        book2.getAuthor();
        book3.getGenre();
    }
}
