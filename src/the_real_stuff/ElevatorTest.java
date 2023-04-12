package the_real_stuff;

/*
 * Karim M.
 * March 2, 2023
 * Testing the Elevator class object with miscellaneous tasks
 */


public class ElevatorTest {

	public static void main(String[] args) {
		
		System.out.println(Elevator.manufacturer + "\n");
		
		Elevator south = new Elevator();
		Elevator east = new Elevator(5);
		
		String s = "SOUTH ELEVATOR \n";
		String e = "EAST ELEVATOR \n";
		
		//south elevator starts with 0 passengers and 1st floor
		System.out.println(s + south);
		
		//10 people get into the south elevator
		south.addPeople(10);
		south.closeDoors();
		System.out.println(s + south);
		
		//3 people get out of the south elevator on the 4th floor
		south.goToFloor(4);
		south.openDoors();
		south.removePeople(3);
		south.closeDoors();
		System.out.println(s + south);
		
		//the rest of the passengers get out of the south elevator
		south.goToFloor(17);
		south.openDoors();
		south.removePeople(7);
		south.closeDoors();
		System.out.println(s + south);
		
		//east elevator picks up 8 people on the 5th floor
		east.addPeople(8);
		east.closeDoors();
		System.out.println(e + east);
		
		//east elevator is filled to max capacity on the 8th floor
		east.goToFloor(8);
		east.openDoors();
		east.addPeople(30);
		east.closeDoors();
		System.out.println(e + east);
		
		//trying to go below the surface
		south.goToFloor(-6);
		System.out.println(s + south);
		
		//trying to pull a Willy Wonka
		south.goToFloor(35);
		System.out.println(s + south);
	
		//both elevators go to the 2nd floor
		south.goToFloor(2);
		east.goToFloor(2);
		System.out.println(s + south);
		System.out.println(e + east);
		
		//opening doors
		east.openDoors();
		System.out.println(e + east);
		
		//testing for power failure
		south.setPower(false);
		south.setPower(true);
		south.setPower(true);
		System.out.println(s + south);
		
		//starting at the first floor
		//going up one floor at a time until it reaches the 10th floor, opening its doors each time
		south.goToFloor(0);
		System.out.println(s  + south);
		for (int i = 1; i < 10; i++) {
			
			south.openDoors();
			south.moveUp(i);
			south.closeDoors();
			System.out.println(south);
		}
		
	}

}
