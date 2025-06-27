
public abstract class LibrarySystem {
	
	private String title;
	private String author;
	private int publicationYear;

	public LibrarySystem(String title, String author, int Year) {

		this.title = title;
		this.author = author;
		this.publicationYear = Year;

	}

	public String getTitle() { return this.title; }

	public String getAuthor() { return this.author; }

	public int getPublicationYear() { return this.publicationYear; }


	public void setAuthor(String author) { this.author = author; }

	public void setTitle(String title) { this.title = title; }

	public void setPublicationYear(int Year) { this.publicationYear = Year; }


	@Override
	public String toString() { return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublication Year: " + getPublicationYear(); }

}