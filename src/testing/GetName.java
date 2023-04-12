package testing;

/**
 * takes a user's first and last name and then sticks them together
 * @author moham
 *
 */

public class GetName {

	String firstName;
	String lastName;
	
	/**
	 * object that joins two words together
	 * @param firstName
	 * @param lastName
	 */

	GetName(String firstName, String lastName) {}

	/**
	 * Where the real heavy lifting happens
	 * @return the dude's full name
	 */
	
	String GetFullName() {
		return firstName + " " + lastName;
	}

}
