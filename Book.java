/**
 * Book.java
 */

import java.util.Date;

public class Book{
  
  public static final int AVAILABLE = 1;
    
  public static final int UNAVAILABLE = 2;
  
  private String title;
  private String author;
  private String isbn;
  private int pages;
  private int year;
  private int status;
  
  private Date due;
  private Patron patron;
  
  public void Book(String title, String author, String isbn, int year, int pages) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.year = year;
    this.pages = pages;
  }
  // Like the constructor, the checkin method should set the book's status to AVAILABLE 
  // and assign null to both patron and due date.
  public void checkin() {
    status = AVAILABLE;
    due = null;
    patron = null;
  }
  // The checkout method should make the book UNAVAILABLE and 
  //save the given patron and due date in the object
  public void checkout(Patron patron, Date due) {
    status = UNAVAILABLE;
    this.patron = patron;
    this.due = due;
  }
  
  // The equals method checks whether two books have the same isbn. 
  // If the given object is a Book, compare this.isbn with the other book's isbn. 
  // If the given object is a String, compare this.isbn with the string
  public boolean equals(Object other) {
    if (other instanceof Book) {
      if (this.isbn.equals(isbn)) {
        return true;
      }
      else {
        return false; 
      }
    }
    else if (other instanceof String) {
      if (this.isbn.equals(other)) {
        return true;
      }
      else {
        return false; 
      }
    }
    else {
      return false;
    }
  }
  
  // In the UML diagram, getX is actually eight methods: 
  // one accessir method for each of the eight attributes
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public String getIsbn() {
    return isbn;
  }
  
  public int getYear() {
    return year;
  }
  
  public int getPages() {
    return pages;
  }
  
  public int getStatus() {
    return status;
  }
  
  public Patron getPatron() {
    return patron;
  }
  
  public Date getDue() {
    return due;
  }
  
  // The toString method should return a String representation of the book
  public String toString() {
    return String.format("Title: %s Author: " + author + ", ISBN: " + isbn + ", Year: " + year + ", Pages: " + pages + ".");
  }
  
}

