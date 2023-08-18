package com.leo.booklibrary.domain;

public class Customer {
  private int id; 
  private String name;

  public Customer(String name, int id) {
    this.name = name;
    this.id = id;
  }

  // Getters and setters
  public String getName() {
    return this.name;
  }
  public int getId() {
    return this.id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setId(int id) {
    this.id = id;
  }
}
