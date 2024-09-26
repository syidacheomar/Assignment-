import java.time.LocalDate;
import java.util.ArrayList;

class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    
    //add method for addbook
    public void addBook(Book book){
        books.add(book);
        
    }

    //add method for adduser
    public void addUser(User user){
        users.add(user);
    }

    //method to search book by title
    public void searchByTitle(String title){
        System.out.println("--- Search Results for: " + title + " ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found: " + book.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching books found.");
        }

    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getIsAvailable()) {
                book.setIsAvailable(false);
                user.borrowBook(title, LocalDate.now().plusDays(14));
                System.out.println(user.getName() + " borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    public void listAvailableBooks(){
        System.out.println("--- Available Books ---");
        books.forEach(book -> {
            if (book.getIsAvailable()) book.printBookInfo();
        });
    }

    public void getBorrowedBooksForAllUsers(){
        System.out.println("Borrowed books for all users:");
        for (User user : users) {
            System.out.println(user.getName() + " has borrowed:");
            user.checkDueDates();  // Prints borrowed books and due dates
            System.out.println("-----------------------------");
        }

    }
    
}
