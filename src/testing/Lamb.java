package testing;

import java.lang.FunctionalInterface;
import java.util.Scanner;

@FunctionalInterface
interface davids {
	
	abstract String testicles(String pubes);
	
}
	public class Lamb {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Gimme a string");
			String input = sc.nextLine();
			System.out.println(input);
		
			davids balls = (pubes) -> {
				
				String plumbus = "";
				for (int i = pubes.length() - 1; i >= 0; i--) {
					plumbus = plumbus + pubes.charAt(i);
				}

			return plumbus;};
			
			System.out.println(balls.testicles(input));
		}

	}