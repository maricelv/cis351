import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Lab 5 ArrayList
// Maricel Vicente bvicente@syr.edu


public class PlantArrayListExample {

   // TODO: Define a PrintArrayList method that prints an ArrayList of plant (or flower) objects                                                       
  public static void PrintArrayList(ArrayList<Plant> myGarden) {
    for (int i=0; i < myGarden.size(); i++) {
      myGarden.get(i).printInfo();
    }
  }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<Plant>();
      
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOfFlowers;
      Boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
               // Record the plant name
               plantName = scnr.next();
               // Record the plant cost
               plantCost = scnr.next();
             if (input.equals("plant"))
             { 
               //  Store as a plant object
               Plant plnt = new Plant();
               // Set plant name 
               plnt.setPlantName(plantName);
               // Set plant cost
               plnt.setPlantCost(plantCost);
               //  Add to the ArrayList myGarden
               myGarden.add(plnt);
             }
             else if (input.equals("flower"))
             {
               Flower flwr = new Flower();
               // set flower name
               flwr.setPlantName(plantName);
               // set flower cost
               flwr.setPlantCost(plantCost);
               // Record annual
               isAnnual = scnr.nextBoolean();
               // Record color of flower
               colorOfFlowers = scnr.next();
               // set is annual
               flwr.setPlantType(isAnnual);
               // set color of flowers
               flwr.setColorOfFlowers(colorOfFlowers);
               //  Add to the ArrayList myGarden
               myGarden.add(flwr);
             

           }
         input = scnr.next();
      }
      
      // TODO: Call the method PrintArrayList to print myGarden
      PrintArrayList(myGarden);
   }
}