// Lab 4 Classes and Objects

// CarTester.java

// Maricel Vicente 
// bvicente@syr.edu

// PART THREE
public class CarTester {
	public static void main(String[] args)
	{
		Car car1;
		Car car2;

       // Create two car objects
		car1 = new Car("Land Rover", 1991);
		car2 = new Car("Mercedes", 2009);


		System.out.println(car1.toString());
        System.out.println(car2.toString());

        // PART FIVE
        // For the first car, call the accelerate() method 5 times in a row and call the getSpeed() method
		// in a print statement (with an appropriate label) for each increase.
        car1.accelerate();
        System.out.println(car1.toString());
        car1.accelerate();
        System.out.println(car1.toString());
        car1.accelerate();
        System.out.println(car1.toString());
        car1.accelerate();
		System.out.println(car1.toString());
        car1.accelerate();
        System.out.println(car1.toString());

        // . Do the same for the second car but accelerate only 3 times in a row also calling getSpeed() in
		// a print statement for each acceleration.
        System.out.println();
		car2.accelerate();
        System.out.println(car2.toString());
        car2.accelerate();
        System.out.println(car2.toString());
        car2.accelerate();
        System.out.println(car2.toString());

        // For the first car, call brake 5 times in a row calling getSpeed() with each pass.
        
        System.out.println();
        car1.brake();
        System.out.println(car1.toString());
        car1.brake();
        System.out.println(car1.toString());
        car1.brake();
        System.out.println(car1.toString());
        car1.brake();
        System.out.println(car1.toString());
        car1.brake();
        System.out.println(car1.toString());
        
        // Print the result of a call to the toString() method for each of the cars. 
        // The first car should be at zero and the second at 15 mph.
        System.out.println();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
	}
}