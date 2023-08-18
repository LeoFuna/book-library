package com.leo.booklibrary.domain;

public class Book {
  private int id;
  private String title;


  public Book(int id, String title) {
    this.id = id;
    this.title = title;
  }

  //Getters and Setters
  public String getTitle() {
    return this.title;
  }
  public int getId() {
    return this.id;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setId(int id) {
    this.id = id;
  }
}
