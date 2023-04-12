package the_real_stuff;

/*
 * Karim M.
 * Feb 09, 2023
 * Program that manipulates the users' string inputs
 */

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello human. Please input a sentence.");
		String str = sc.nextLine();
		str = str.toLowerCase();

		str = wordModifier(str);
		str = the_a_Remover(str);
		System.out.println(str);

		int a = str.indexOf(" ");
		if (a != -1) {
			int b = str.indexOf(" ", a + 1);
			if(b != -1) {
				str = str.substring(0 , a) + str.substring(b);
			}
		}
		System.out.println(str);
	}

	static String the_a_Remover(String str) {

		if(str.substring(0,2).equals("a ") || str.substring(0,4).equals("the ")) {
			str = str.replace("a ", "");
			str = str.replace("the ", "");
		} else return str;
		if (str.contains(" a ") || str.contains(" the ")) {
			str = str.replace(" a ", " ");
			str = str.replace(" the ", " ");
		} else return str;
		return str;
	}

	static String wordModifier(String str) {

		if (str.substring(0, 8).equals("pick up ") || str.substring(0, 9).equals("climb up ")) {
			str = str.replace("pick up ", "pickup ");
			str = str.replace("climb up ", "climb ");
		} else return str;
		if (str.contains(" pick up ") || str.contains(" climb up ")) {
			str = str.replace(" pick up ", " pickup ");
			str = str.replace(" climb up ", " climb ");
		} else return str;
		return str;
	}

}
