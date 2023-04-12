package quizzes_and_stuff;

class Messages {

	static String message1 = "I wish I was not sick";
	
	String message3 = "I wonder when to use subjunctive in English";
	
	private String message4 = "Birds are returning for the spring";
	
	Messages() {
		String message5 = "History teaches us that history teaches us nothing.";
		System.out.println(message5);
	}
	
	//gets message and make checks if its the wrong string
	void getMessage(String message4) {
		if (!message4.equals("Birds are returning to Canada")) {
			setMessage();
		}
	}
	
	//changes the message and returns it
	static String setMessage() {	
		String message4 = "Birds are returning to Canada";	
		return message4;
	}
	
	Messages(String name) {
		System.out.println(name + ", you are unique, but so is everyone else. (Message 7)");
	}
	
	static String mess2() {
		String message2 = "We should start on File I/O soon";
		return message2;
	}
	
	String mess6() {
		String message6 = "Has anyone had a pyrric victory recently?";
		return message6;
	}
}

/*********** INSTRUCTIONS ****************
1. Write a separate program that uses the Messages class.
Lets' call it PrintMessages.java
Begin by writing the code needed to print out message 1 and 2.
Then print out the rest in any order.

You should NOT modify Messages.java to do this, EXCEPT for message4, see below.

Write a getter and setter so that message4 can be changed to "Birds are returning to Canada" and then print it out.  
For this you'll have to add methods to the Messages class, as well as write the appropriate code in the PrintMessages class

Written answers: 
~~~~~~~~~~~~~~~~ 
2. a) Explain what "final" is used for.


b) What is the difference between "final static int x" and "final int x"? 

3. Explain the difference between public String name, String name, and private String name.

*/
  