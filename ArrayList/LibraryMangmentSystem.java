package ArrayList;

import java.util.*;

public class LibraryMangmentSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ReferenceBook> rb = new ArrayList<ReferenceBook>();
		System.out.println("Enter Number of Books : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Book ID , Title, Author Name, Publication Year, Book Price");
			int id = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String authorNameString = sc.nextLine();
			int publicationYear = sc.nextInt();
			sc.nextLine();
			double bookPrice = sc.nextDouble();
			rb.add(new ReferenceBook(id, title, authorNameString, publicationYear, bookPrice));

		}

		for (ReferenceBook e : rb) {
			e.displayDetails();
		}
		System.out.println("------------------------");

		Collections.sort(rb);
		for (ReferenceBook e : rb) {
			e.displayDetails();
		}

		System.out.println("---------------------");
		Collections.sort(rb, new BookTitleComparator());

		for (ReferenceBook e : rb) {
			e.displayDetails();
		}

		System.out.println("-----------------------");
		System.out.println("Enter a Search Id for Book");
		int id = sc.nextInt();
		for (ReferenceBook e : rb) {
			if (e.bookdID == id) {
				System.out.println("Book Found Name : " + e.title);
				break;
			} else {
				System.out.println("Book Not Found ");
			}
		}

		System.out.println("---------------------");
		System.out.println("Enter Filter Year For Bokk");
		int filteryear = sc.nextInt();
		boolean isfound = false;

		for (ReferenceBook e : rb) {
			if (e.publicationYear > filteryear) {
				System.out.println("Book Found Name : " + e.title);
				isfound = true;
				break;
			}
		}
		if (!isfound) {
			System.out.println("No Older Book");
		}

	}

}

class Book implements Comparable<Book> {
	int bookdID;
	String title;
	String authorName;

	public Book(int bookdID, String title, String authorName) {

		this.bookdID = bookdID;
		this.title = title;
		this.authorName = authorName;
	}

	public void displayDetails() {
		System.out.println("Book ID : " + bookdID);
		System.out.println("Book Title : " + title);
		System.out.println("Author Name : " + authorName);
	}

	public int compareTo(Book o) {
		ReferenceBook r = (ReferenceBook) this;
		ReferenceBook r2 = (ReferenceBook) o;
		if (r.publicationYear != r2.publicationYear) {
			return r.publicationYear - r2.publicationYear;
		} else {
			return r.bookdID - r2.bookdID;
		}

	}
}

class ReferenceBook extends Book {
	int publicationYear;
	double bookPrice;

	public ReferenceBook(int bookdID, String title, String authorName, int publicationYear, double bookPrice) {
		super(bookdID, title, authorName);
		this.publicationYear = publicationYear;
		this.bookPrice = bookPrice;
	}

	public void displayDetails() {
		System.out.println("Book ID : " + bookdID);
		System.out.println("Book Title : " + title);
		System.out.println("Author Name : " + authorName);
		System.out.println("Publication Year : " + publicationYear);
		System.out.println("Book Price " + bookPrice);
	}

}

class BookTitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int result = o1.title.compareTo(o2.title);

		if (result == 0) {
			return o1.title.compareTo(o2.title);
		} else {
			return o1.bookdID - o2.bookdID;
		}
	}

}