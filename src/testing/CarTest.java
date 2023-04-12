package testing;

public class CarTest {
	
	public static void main(String[] args) {
	
		//static variable exists even without making objects
		System.out.println( Toyota.company );
		
		//System.out.println( Toyota.colour );
		
		//Toyota() will run the constructor for Toyota class
		//If there is no constructor, it runs the Object class constructor
		//since all classes are descendants of it.
		
		Toyota car1 = new Toyota("Yarris", "Red", 15500);		
		System.out.println(car1.model); 
		
		Toyota car2 = new Toyota("Corolla");
		System.out.println(car2.colour);
		//car2.model = "Prius";  cannot be changed because it is "final"
		
		System.out.println(car2.getOdometer());
		car2.drive(1000);
		System.out.println(car2.getOdometer());
		
		//Because these are objects, not primitive data types,
		//car3 is now pointing to the same object that car2 does
		Toyota car3 = car2;
		System.out.println(car3.colour);
		car3.colour = "Aubergine"; 
		System.out.println("car2 = " + car2.colour);

		//Printing an object will print out the hash code of the object
		//The hash code is like the memory location
		//System.out.println(car2);		

		Toyota car8 = new Toyota("Rav4");
		Toyota car9 = new Toyota("Rav4");
		
		if (car8 == car9) {
			System.out.println("** same car **");
		}
		if (car8.equals(car9)) {
			System.out.println("Actually, they are equal.");
		}
		System.out.println("8: " + car8.toString());
		System.out.println("9: " + car9);
		
	}
}
  