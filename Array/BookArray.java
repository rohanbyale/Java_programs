import java.util.Scanner;

public class BookArray {
    static Book a[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Books: ");
        int size = sc.nextInt();

        a = new Book[size];
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter  authorname : , Title : , Price: , Published Year :  " + i + 1);
            String authorName = sc.nextLine();
            String title = sc.nextLine();
            double price = Double.parseDouble(sc.next());
            int publishedyear = Integer.parseInt(sc.next());

            a[i] = new Book(authorName, title, price, publishedyear);

        }

        System.out.println("enter the choice 1) for author 2) title 3)  year 4) price ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                String authorname = sc.nextLine();
                displayBookbyAuthorname(authorname);
            }
            case 2 -> {
                String title = sc.nextLine();
                displayBookbytitle(title);
            }
        }

        AveragePrice();
    }

    public static void displayBookbyAuthorname(String authorname) {
        for (Book b : a) {
            if (authorname.equals(b.authorName)) {
                b.displayDetails();
                System.out.println("------------------------------------->");
            }
        }
    }

    public static void displayBookbytitle(String title) {
        for (Book b : a) {
            if (title.equals(b.title)) {
                b.displayDetails();
                System.out.println("------------------------------------->");
            }
        }
    }

    public static void AveragePrice() {
        double sum = 0;
        for (Book b : a) {
            sum = sum + b.price;
        }
        System.out.println("Average Price of the Book : " + (sum / a.length));

    }
}

class Book {
    public String authorName;
    public String title;
    public double price;
    public int publishedyear;

    public Book(String authorName, String title, double price, int publishedyear) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.publishedyear = publishedyear;
    }

    public void displayDetails() {
        System.out.println("title of the Book: " + title);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price of the book " + price);
        System.out.println("Book published year: " + publishedyear);
    }
}
