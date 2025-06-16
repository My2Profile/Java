package Library;

import java.util.Vector;

public class User {
	Vector<Book> books;

	private String Id;
	private String Username;

	public User(String Id, String Username) {
		this.Id = Id;
		this.Username = Username;
	}


	public Vector<Book> displayBooks() {
		return books;
	}



}