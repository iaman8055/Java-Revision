package Oops.src;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isborrowed;

    static {
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;
    }


    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        
    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

     void borrowbook(){
        if(isborrowed){
            System.out.println("Book is already bought");
        }else{
            isborrowed=true;
        }

    }
     void returnBook(){
        if(isborrowed){
            this.isborrowed=false;
            System.out.println("Hope you enjoyed,please leave a review");
        }
        else {
            System.out.println("This book is already in the library");
        }
    }
    public static void main(String[] args) {
        Book designofthings = new Book("1","Design","xyz");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designofthings.borrowbook();
        myBook.borrowbook();
        designofthings.borrowbook();
        designofthings.borrowbook();
        designofthings.returnBook();

    }
    
}
