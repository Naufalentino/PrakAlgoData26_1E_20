import java.util.Stack;
public class StackDemo20 {
    public static void main(String[] args) {
        Book20 book1 = new Book20("1234", "Dasar Pemrograman");
        Book20 book2 = new Book20("7145", "Hafalan Shalat Delisa");
        Book20 book3 = new Book20("3562", "Muhammad Al-Fatih");
        
        Stack<Book20> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);
    }
}