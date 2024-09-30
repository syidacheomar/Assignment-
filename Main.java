public class Main {

    public static void main(String[] args) {
        
        //create library instance
        Library library = new Library();
        
        //add few book objects to the library
        Book book1 = new Book("Harry Potter", "J.K. Rowlin" , "12345" , true);
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien" , "67890" , true);

        library.addBook(book1);
        library.addBook(book2);

        //create few user objects and add to the library

        User user1 = new User("Syida", 24);
        User user2 = new User("Azleen" , 24);

        library.addUser(user1);
        library.addUser(user2);

        // Listing available books
        library.listAvailableBooks();

        System.out.println("--- Borrowing a book ---");

        // Borrowing books
        library.borrowBook(user1, "Harry Potter");
        library.borrowBook(user2, "Lord of the Rings");

        System.out.println("---Overdue Books---");

        // Check due dates
        user1.checkDueDates();
        user2.checkDueDates();

        // Check overdue books after simulating time passing (e.g., using LocalDate.now().minusDays(15))
        //user1.checkOverdueBooks();
        //user2.checkOverdueBooks();




    }
    
}
