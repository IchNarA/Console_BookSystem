
public class Book {

	private String title;
	private String autor;
	private int isbn;
	
	public Book(String title, String autor, int isbn){
		this.title = title;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public Integer getIsbn() {
		return isbn;
	}
	
	@Override
	public String toString() {
		return title + " " + autor + " " + isbn;
	}
	
}
