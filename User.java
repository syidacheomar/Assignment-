import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class User{
    private String name;
    private int age;
    private ArrayList<String>borrowedBooks= new ArrayList<>();
    private Map<String, LocalDate>borrowedBooksDueDates = new HashMap<>();
    
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void borrowBook(String bookTitle, LocalDate nowDate){

        borrowedBooks.add(bookTitle);
        
        // Calculate the due date (14 days from now)
        LocalDate dueDate = LocalDate.now().plusDays(14);
        borrowedBooksDueDates.put(bookTitle, dueDate);

    }

    public void returnBook(String bookTitle){

        if (borrowedBooks.remove(bookTitle)) {
            borrowedBooksDueDates.remove(bookTitle);
            System.out.println("Returned: " + bookTitle);
        } else {
            System.out.println("Book not borrowed: " + bookTitle);
        }

    }

    public void printBorrowedBooks(){
        for(String borrowedBook: borrowedBooks){
            System.out.println(borrowedBook);
        }
    }

    public void checkDueDates(){
        System.out.print("User:" + " " + getName() + "," + " ");

        for(String borrowedBook : borrowedBooks) {
            LocalDate dueDate = borrowedBooksDueDates.get(borrowedBook);
            System.out.print("Book:" + " " + borrowedBook + "," + " ");
            System.out.print("Due Date: " + " " + dueDate);
            System.out.println();
        }
        
    }

    public void checkOverdueBooks(){
        LocalDate currentDate = LocalDate.now();
        borrowedBooksDueDates.forEach((books, date) -> {
            long overdueDays = date.isBefore(currentDate) ? 
                currentDate.toEpochDay() - date.toEpochDay() : 0;
            if (overdueDays > 0) {
                System.out.println("Overdue: " + books + ", Overdue by " + overdueDays + " days.");
            }
        });
    }
}


