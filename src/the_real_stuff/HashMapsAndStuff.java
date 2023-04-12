package the_real_stuff;

/*
 *  Karim M.
 *  March 25, 2023
 *  HashMap program that deletes items based off of certain criteria
 */

import java.util.HashMap;

public class HashMapsAndStuff {	

	public static void main(String[] args) {

		HashMap<String, Double> bankInfo = new HashMap<String, Double>();

		bankInfo.put("Bank Account", (double) 83967236);
		bankInfo.put("SIN", (double) 2103966104);
		bankInfo.put("Weight", (double) 573966104);
		bankInfo.put("Balance", (double) 11467.97);
		bankInfo.put("Height", (double) 2.45);

		//prints out the initial contents of the HashMap
		System.out.println("Initial info: " + bankInfo);

		while (true) {

			boolean x = false;

			for (String s : bankInfo.keySet()) {

				//remove any entries with a value less than 1000000
				if (bankInfo.get(s) < 1000000) {
					bankInfo.remove(s);
					x = true;
					break;
				}
			}
			if (!x) break;
		}

		//prints out the final contents
		System.out.println("Final info: " + bankInfo);
	}

}
