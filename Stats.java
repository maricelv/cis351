/**
 * Homework 4
 * Maricel Vicente bvicente@syr.edu
 */
import java.util.ArrayList;
public class Stats {
  
  public static double mean(ArrayList<Double> data) 
  {
    // check if ArrayList is empty, if not compute the average
    if (!(data.isEmpty() && data.size() > 0)) {
    double total = 0;
    for(int i=0; i< data.size(); i++)
    {
      total = total + data.get(i);
    }
    
    double average = total / data.size();
    return average;
    }
    // Return NAN if array is empty
    else {
      return Double.NaN;
    }
  }
  
  
  public static double stdDev(ArrayList<Double> data)
  {
    // check if array is empty and has more than 1 element
    if (!(data.isEmpty() && data.size() > 0)) {
    double std = 0;
    for (int i = 0; i < data.size(); i++) 
    {
      std = std + Math.pow((data.get(i) - mean(data)), 2) / data.size();
    }
    
    double stDev = Math.sqrt(std);
    return stDev;
    }
    else {
      return Double.NaN;
    }
  }
  
}
