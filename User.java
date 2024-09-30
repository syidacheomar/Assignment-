import java.util.ArrayList;
import java.time.LocalDate; //alow to work with dates
import java.util.HashMap; //allow to use key value pairs ( key = booktitle , value = date)
import java.util.Map; // same as above 

class User{
    private String name;
    private int age;
    private ArrayList<String>borrowedBooks= new ArrayList<>(); 
    private Map<String, LocalDate>borrowedBooksDueDates = new HashMap<>(); //to store due date to each borrowed book
    
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
        borrowedBooksDueDates.put(bookTitle, dueDate); //store due date into map using the key (book Title)

    }

    public void returnBook(String bookTitle){

        if (borrowedBooks.remove(bookTitle)) { // to remove book from the list of borrow book
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

        for(String borrowedBook : borrowedBooks) { // to convert from array to line 
            LocalDate dueDate = borrowedBooksDueDates.get(borrowedBook);
            System.out.print("Book:" + " " + borrowedBook + "," + " ");
            System.out.print("Due Date: " + " " + dueDate);
            System.out.println();
        }
        
    }

    public void checkOverdueBooks(){
        LocalDate currentDate = LocalDate.now(); //get current date 

        boolean hasOverdueBooks = false;
        borrowedBooksDueDates.forEach((books, date) -> {
            long overdueDays = date.isBefore(currentDate) ? //check if the date is before today
                currentDate.toEpochDay() - date.toEpochDay() : 0; //to calculate how many days the book is overdue
            if (overdueDays > 0) {
                System.out.println("User:" + getName());
                System.out.println("Overdue: " + books + ", Overdue by " + overdueDays + " days.");
            }
        });
    if(!hasOverdueBooks){
            System.out.println("User:" + getName());
            System.out.println("No overdue books.");
            System.out.println();
        }
    }
}


