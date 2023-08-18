package com.leo.booklibrary;

import com.leo.booklibrary.domain.Book;
import com.leo.booklibrary.domain.BookCollection;
import com.leo.booklibrary.domain.Collection;

public class BookLibraryApplication {

	public static void main(String[] args) {
		System.out.println("Iniciando sistema...");
		Collection libraryCollection = new Collection();

		Book book1 = new Book(1, "The Lord of the Rings");
		BookCollection bookCollectionLord = new BookCollection(book1.getTitle(), 1, 1);
		libraryCollection.addNewBookCollection(bookCollectionLord);

		Book book2 = new Book(2, "Avatar");
		BookCollection bookCollectionAvatar = new BookCollection(book2.getTitle(), 1, 1);
		libraryCollection.addNewBookCollection(bookCollectionAvatar);

		libraryCollection.addBookToCollection(book1);

		libraryCollection.printCurrentCollection();
		System.out.println("Finalizando sistema...");
	}

}
