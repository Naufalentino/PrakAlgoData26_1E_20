public class Book20 {
    public String isbn;
    public String title;

    public Book20(){
        
    }
    
    public Book20 (String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }
    
    public String toString (){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}