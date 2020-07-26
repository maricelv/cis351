// First, you need to implement a derived Flower class, given a base Plant class

public class Flower extends Plant {
  protected boolean isAnnual;
  protected String colorOfFlowers;
  
  // Use the UML Diagram to write the get/set methods
  
  public void setPlantType(boolean userIsAnnual)
  {
    isAnnual = userIsAnnual;
  }
  
  public boolean getPlantType() {
    return isAnnual;
  }
  
  public void setColorOfFlowers(String userColorOfFlower) {
    colorOfFlowers = userColorOfFlower;
  }
  
  public String getColorOfFlowers() {
    return colorOfFlowers;
  }

  public void printInfo() {
      System.out.println("Plant Information: ");
      System.out.println("   Plant name: " + plantName);
      System.out.println("   Cost: " + plantCost);
      System.out.println("   Annual: " + isAnnual);
      System.out.println("   Color of Flowers: " + colorOfFlowers);
      System.out.println();
   }
  
  
  
}