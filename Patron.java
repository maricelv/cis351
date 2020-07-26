/**
 * Patron.java
 */


public class Patron{
  
  private String name;
  private String email;
  private int idNumber;
  private double balance;
  
  public void Patron(String name, String email, int idNumber, double balance) {
    this.name = name;
    this.email = email;
    this.idNumber = idNumber;
    this.balance = balance;
  }
  
  // The adjustBalance will update the current balance of the patron
  public double adjustBalance(double amount) {
    this.balance += amount;
    return this.balance;
  }
  
  // The equals method checks whether two patrons have the same id number
  public boolean equals(Object other) {
    if (other instanceof Patron) {
      if (this.idNumber == idNumber) {
        return true;
      }
    }
    else if (other instanceof Integer) {
      if (this.idNumber == (Integer) other) {
        return true;
      }
    }
    return false;
  }
  
   public String toString() {
    return String.format("Name: %s, Email: %s, Id: %d, Balance: $%.2f",this.name,this.email,this.idNumber,this.balance);
  }
  

  
  
}