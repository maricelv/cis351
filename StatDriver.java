/**
 * Homework 4
 * Maricel Vicente bvicente@syr.edu
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StatDriver {
  
  
  public static void main(String[] args) { 
    // Read a series of numbers from System.in, create an Arraylist containing those numbers, call the mean and
    // standard deviation functions of the Stats class, and then report the results
    
    Scanner scan = new Scanner(System.in);
    
    // Create an ArrayList of doubles
    ArrayList<Double> data = new ArrayList<Double>();
    
    // loop will read input values as doubles and store them in data Arraylist
    while (scan.hasNextDouble()) 
    {
      data.add(scan.nextDouble());
    }
    
    // check if user asked for mean or standard deviation in the command line
    if (args.length > 0 && args != null)
    {
      if (args[0].equals("std"))
      {
        String stdStr;
        stdStr = String.format("StdDev: %.2f\n", Stats.stdDev(data));
        System.out.println(stdStr);
      }
      else {
        String meanStr;
        meanStr = String.format("Mean: %.2f\n", Stats.mean(data));
        System.out.println(meanStr);
      }
    } 
    // if user does not indicate mean or std, then calculate mean
    else 
    {
      String meanStr;
      meanStr = String.format("Mean: %.2f\n", Stats.mean(data));
      System.out.println(meanStr);
    }
     
 
    
    
    
    
    
    
    
  }
  
 
  
}
