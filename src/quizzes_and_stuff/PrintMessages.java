package quizzes_and_stuff;

/*
 * Karim M.
 * March 23, 2023
 * Object Quiz
 */

public class PrintMessages {

	public static void main(String[] args) {

		//prints out 1st message
		System.out.println("1: " + Messages.message1);

		//prints out 2nd message
		System.out.println("2: " + Messages.mess2());

		//prints out the 5th message
		Messages s = new Messages();

		//prints out the 3rd message
		System.out.println("3: " + s.message3);

		//prints out the 4th message
		System.out.println("4: " + Messages.setMessage());

		//prints out 6th message
		System.out.println("6: " + s.mess6());

		//prints out the 7th message
		Messages n = new Messages("7: " + "David");		

/*
2. a) Explain what "final" is used for.

	Final is used for when you want to create an unchangeable variable. For example,
	if you set final int x = 7, then x will ALWAYS be 7, and never change.

b) What is the difference between "final static int x" and "final int x"? 

	The "static" in the variable means that the value only belongs to that variable, and
	can be shared with the entire class.

3. Explain the difference between public String name, String name, and private String name.

	public String name ---> means that all other classes in that package can access that method.
	
	String name ---> the creation of a string object.
	
	private String name ---> means that the only class that can call upon that method is itself, 
	and no other classes can access it.

*/

	}

}
