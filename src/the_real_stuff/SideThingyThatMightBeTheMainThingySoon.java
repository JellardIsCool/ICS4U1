package the_real_stuff;

import java.util.Scanner;

public class SideThingyThatMightBeTheMainThingySoon {

	public static void main(String[] args) {

		String input = "A really long sentence that's definitely longer than 20 characters long, including all spaces.";
		int maxLength = 20;

	
//		while (true) {
//			posIndex++;
//
//			if (array[posIndex] == " ") spaceIndex = posIndex;
//
//			if (posIndex - startIndex == 20) {
//				array[spaceIndex] = "\n";
//				posIndex = spaceIndex + 1;
//				startIndex = spaceIndex + 1;
//			}
//			for (int i = 0; i < array.length; i++) {
//				System.out.print(array[posIndex]);
//			}
//		}
		/*
		int h = 20;
		int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (array.length > maxLength && array[h] == " "){
					array[h] = "\n";
				} else if (array.length > maxLength && array[h] != " ") {
					
					for (int j = h; j < 0; j--) {
						if (array[j] == " ") array[j] = "\n";
						break;
					}
				}
				h+=20;
				count++;
			}

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
			}
		 */
		
		/*int count = 0;
		for (int i = 1; i < (Math.ceil(input.length() / maxLength)+1); i++) {
			String current = input.substring(count, maxLength*i);
			
			System.out.println(current);
			
			count = maxLength*i;
		}
		String current = "";
		int pos = 0;
		
		current = input.substring(0, maxLength+1);
		pos = current.length();
		while (true) {
			Scanner sc1 = new Scanner(current);
			int space = 0;
			sc1.useDelimiter("");
			
			for (int i = 0; i < current.length(); i++) {
				if (sc1.next().charAt(0) == ' ') {
					space = i+1;
				}
			}
			
			String newString = current.substring(0, space-1);
			
			System.out.println(newString);
			sc1.close();
			
			if (pos >= input.length()) break; // checks if finished
            pos = pos - (maxLength - newString.length());
            
            if (pos+maxLength >= input.length()) {
                current = input.substring(pos, input.length()) + " ";
                pos = input.length()-maxLength;
            } else 
                current = input.substring(pos, pos + (maxLength));
            pos = pos + maxLength;
           */ 
		}
	}

