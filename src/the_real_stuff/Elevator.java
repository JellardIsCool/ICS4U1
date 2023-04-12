package the_real_stuff;

import java.util.Scanner;

/*
 * Karim M.
 * Feb 28, 2023
 * Elevator program that collects and delivers passengers to their desired floors
 */

class Elevator {

	static String manufacturer = "David's President Inc.";
	Scanner sc = new Scanner(System.in);

	//elevator may stay on
	boolean powerOn = true;

	//unchangeable variables
	//highest floor
	final int topFloor = 17;
	//maximum occupants of elevator
	final int maxOccup = 23;

	//the floor that the elevator is currently on
	private int currentFloor = 1;

	//the amount of people currently on the elevator
	private int currentOccup = 0;

	//checks whether or not the doors are currently open
	//false --> closed
	//true  --> open
	private boolean openDoors = false;

	Elevator (){}

	Elevator (int currentFloor) {
		if (currentFloor < 0 || currentFloor > 17) currentFloor = 1;
		this.currentFloor = currentFloor;
	}

	//turns on the power
	void setPower (boolean action) {
		if (action == true) {
			if (powerOn == false) {
				this.powerOn = action;
				System.out.println("Bulding power turned on");
			} 
		} else {
			if (powerOn == true) {
				this.powerOn = false;
				System.out.println("Building power turned off");
			}
		}
	}

	//moves the elevator one floor up
	void moveUp (int n) {

		if (powerOn == true) {
			if (currentFloor >= 0 && currentFloor < 17) {
				currentFloor++;
			} else System.out.println("You can't go there");
		}
	}

	//moves the elevator one floor down
	void moveDown (int n) {

		if (powerOn == true) {
			if (currentFloor <= 17 && currentFloor > 0) {
				currentFloor--;
			} else System.out.println("You can't go there");
		}
	}

	//allows passengers to choose their next floor
	void goToFloor(int n) {

		if (powerOn == true) {
			//person on elevator choosing a floor
			if (n > topFloor) {
				currentFloor = topFloor;
			} else if (n < 1) {
				currentFloor = 1;
			}
		}
	}

	//opens the doors
	void openDoors () {

		if (powerOn == true) {
			this.openDoors = true;
		} 
	}
	
	//closes the doors
	void closeDoors () {
		
		if (powerOn == true) {
			this.openDoors = false;
		}
	}

	//adds passengers to the elevator
	int addPeople(int n) {

		if (currentOccup == maxOccup || currentOccup + n > maxOccup) {
			System.out.println("Sorry. Max capacity");
		} else if (currentOccup < maxOccup && currentOccup + n <= maxOccup) {
			this.currentOccup = currentOccup + n;
		}
		return currentOccup;
	}

	//kicks people off the elevator
	int removePeople(int n) {
		if (currentOccup - n >= 0) {
			this.currentOccup = currentOccup - n;
		} else this.currentOccup = 0;
		return this.currentOccup;
	}

	@Override
	public String toString() {

		String doors;
		if (openDoors == true) {
			doors = "open";
		} else doors = "closed";
		return String.format("Manufacturer: %s | Current Passengers: %d | Current Floor: %d | Current Power State: %b | Doors: %s \n", manufacturer, currentOccup, currentFloor, powerOn, doors);

	}

}
