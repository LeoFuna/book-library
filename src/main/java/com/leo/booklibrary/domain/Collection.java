package com.leo.booklibrary.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
  private BookCollection[] bookCollections = new BookCollection[0];

  //Getter and Setter
  public BookCollection[] getBookCollection() {
    return this.bookCollections;
  }
  public void setBookCollection(BookCollection[] bookCollections) {
    this.bookCollections = bookCollections;
  }

  public void addBookToCollection(Book book) {
    BookCollection bookCollectionFound = this.findBookCollection(book.getTitle());
    if (bookCollectionFound != null) {
      bookCollectionFound.addBookToCollection(1);
    } else {
      BookCollection newBookCollection = new BookCollection(book.getTitle(), 1, 1);
      this.addNewBookCollection(newBookCollection);
    }

  }

  public void addNewBookCollection(BookCollection bookCollection) {
    if (this.bookCollections.length == 0) {
      this.bookCollections = new BookCollection[1];
      this.bookCollections[0] = bookCollection;
      return;
    }

    List<BookCollection> bookCollectionsList = new ArrayList<BookCollection>(Arrays.asList(this.bookCollections));
    bookCollectionsList.add(bookCollection);
    this.bookCollections = bookCollectionsList.toArray(this.bookCollections);
  }

  private BookCollection findBookCollection(String bookTitle) {
    BookCollection bookCollectionFound = null;
    for(int i = 0; i < this.bookCollections.length; i++) {
      BookCollection bookCollection = this.bookCollections[i];
      if (bookCollection.getName() == bookTitle) {
        bookCollectionFound = bookCollection;
        break;
      }
    }
    return bookCollectionFound;
  }

  public void printCurrentCollection() {
    int totalBooks = 0;
    int totalBorrowdBooks = 0;
    System.out.println("*********************");
    System.out.println("Coleção atual:");
    for(int i = 0; i < this.bookCollections.length; i++) {
      BookCollection bookCollection = this.bookCollections[i];
      System.out.println("Livro: " + bookCollection.getName() + " | Total: " + bookCollection.getTotalUnits() + " | Disponíveis: " + bookCollection.getAvailableUnits());
      totalBooks += bookCollection.getTotalUnits();
      totalBorrowdBooks += (bookCollection.getTotalUnits() - bookCollection.getAvailableUnits());
    }
    System.out.println("---------------------");
    System.out.println("Total de livros: " + totalBooks);
    System.out.println("Total de livros emprestados: " + totalBorrowdBooks);
    System.out.println("*********************");
  }
}
