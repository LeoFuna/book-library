package com.leo.booklibrary.domain;

public class BookCollection {
  private String name;
  private int totalUnits;
  private int availableUnits;

  public BookCollection(String name, int totalUnits, int availableUnits) {
    this.name = name;
    this.totalUnits = totalUnits;
    this.availableUnits = availableUnits;
  }

  public String getName() {
    return this.name;
  }
  public int getTotalUnits() {
    return this.totalUnits;
  }
  public int getAvailableUnits() {
    return this.availableUnits;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setTotalUnits(int totalUnits) {
    this.totalUnits = totalUnits;
  }
  public void setAvailableUnits(int availableUnits) {
    this.availableUnits = availableUnits;
  }

  public void addBookToCollection(int unities) {
    this.totalUnits += unities;
    this.availableUnits += unities;
  }
}
