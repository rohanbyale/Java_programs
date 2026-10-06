package CloneObject.java;

public import java.util.*;

public class LibraryBookCopytSystem {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();
        if(price < 0){
            System.out.println("Error: Invalid book details");
            return;
        }

        Book  b = new Book(id, title,author,price);
        System.out.print("Original Book: ");
        System.out.println(b);

        System.out.print("Cloned Book: ");
        Book b2 = b.clone();
        b2.price = b2.price+50;
        System.out.println(b2);
        
        
    }
}
class Book implements Cloneable{
    public String id;
    public String title;
    public String author;
    public double price;

    public Book(String id, String title, String author,double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

        @Override
    public Book clone() throws CloneNotSupportedException
    {
        return (Book) super.clone();
    }

    public String toString(){
        return id+" "+title+" "+author+" "+ price;
    }
} {
    
}
