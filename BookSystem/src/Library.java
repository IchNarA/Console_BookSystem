import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	
	public Library(){
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Kniha úspešne pridaná");
	}
	
	public void showBooks() {
		if(books.isEmpty()) {
			System.out.println("V kniznice su neni ziadne knihy");
		}
		else {
			for(Book book: books) {
				System.out.println(book);
			}
		}
	}
	
	public void deleteBook(int isbn) {
		if(books.isEmpty()) {
			System.out.println("V kniznice su neni ziadne knihy");
		}
		else {
			for(Book book: books) {
				if(book.getIsbn() == isbn) {
					books.remove(book);
					System.out.println("Uspesne odstranena kniha!");
					return;
				}
			}
			System.out.println("Takato kniha neexistuje");
		}
	}
	
	public void searchBook(String title) {
		if(books.isEmpty()) {
			System.out.println("V kniznice su neni ziadne knihy");
		}
		else {
			for(Book book: books) {
				if(book.getTitle().equalsIgnoreCase(title)) {
					System.out.println(book);
					return;
				}
			}
			System.out.println("Takato kniha neexistuje");
		}
	}
	
	
}
