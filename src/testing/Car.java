package testing;


class Toyota { 

	/** Global variables **/
	static String company = "Harwood Dealership";
		
	/** Instance variables. **/ 
	String colour;	 
	//If final variables are not initialize here, 
	//they have to be initialized in a constructor
	final String model;
	//Private means that it can only be seen in this class
	private int odometer = 25; //default values can be set here or in constr.
	
	/** Constructors **/
	//Now no one can use an empty constructor
	private Toyota() {
		model = "--unknown--";
	}
		
	Toyota(String model, String colour, int odo) {
		this(model,colour);		
		odometer = Math.abs(odo);			
	}
	
	//same as above, but use the default odometer
	Toyota(String model, String colour) {
		//"this." refers to the instance variables of the class
		// 		  it refers to anything inside this object
		this.model = model;
		this.colour = colour;
	}
	//example of setting default values in constructor
	Toyota(String model) {
		this.model = model;
		this.colour = "Black";
	}
	//instance methods
	
	//for private variables we need "getters" and "setters"
	int getOdometer() { return odometer; }
	//void setOdometer(int n) { odometer = n; }
	
	void drive(int km) {
		odometer += Math.abs(km);
	}
	
	/* We rarely need to write a .equals() method, but this is how we could */
	//This method compares two car objects to see if they are identical
	//The first car is ""this" and the second car is "car2" 
	//@Override  <-----???
	boolean equals_v1(Toyota car2) {
		if (this.colour.equals(car2.colour) ) {
			if (this.odometer == car2.odometer) {
				if (this.model.equals(car2.model)) {
					return true;
				}
			}
		}
		return false;
	}  
	
	boolean equals(Toyota car2) {
		if (this.odometer != car2.odometer) 	return false;
		if (! this.colour.equals(car2.colour))   return false;		
		if (! this.model.equals(car2.model)) 	return false;
		
		return true;		
	}
	
	//toString() . This will return ONE LINE of text 
	//with whatever variables you consider important.
	@Override
	public String toString() {
//		String s = "Model: " + model + ", " + colour + ". " + odometer + " km";
//		return s;
		
		//using printf format is nicer
		return String.format("Model: %s, %s. %d", model, colour, odometer);
	}
}
  