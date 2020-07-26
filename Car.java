// Lab 4 Classes and Objects

// Car.java

// Maricel Vicente 
// bvicente@syr.edu


public class Car {
	private int year;
	private String make;
	private double speed;

   // Create a constructor using the "this" qualifier
	public Car(String make, int year) {
		this.make = make;
		this.year = year;
		speed = 0;
	}

    public String toString() {
    	return String.format("A %d %s that is going %.1f mph", year, make, speed);
    } 
   // Get Methods will return the attribute
    public int getYear() {
    	return year;
    }

    public String getMake() {
    	return make;
    }

    public double getSpeed() {
    	return speed;
    }
    // Accelerate increases speed by 5
    public void accelerate() {
		speed = speed + 5;
    }
    // Break decreases speed by 5
    public void brake() {
		speed = speed - 5;
    }
}