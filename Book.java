class Book {
    public String title;
    public String author;
    public String isbn;
    public boolean isAvailable;

    public Book(String title, String author, String isbn, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public void printBookInfo(){
        System.out.println("Title:" + " " + getTitle());
        System.out.println("Author:" + " " + getAuthor());
        System.out.println("ISBN:" + " " + getIsbn());
        System.out.println("Available:" + " " + getIsAvailable());
        System.out.println();
    }    
}
