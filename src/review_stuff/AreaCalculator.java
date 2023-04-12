package review_stuff;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Would you like to calculate the area of a TRIANGLE or a PARALLELOGRAM?");
		String str = sc.nextLine();

		if (str.equals("TRIANGLE")){

			System.out.println("Please enter your base length:");
			int t_base = sc.nextInt();

			System.out.println("Please enter your height:");
			int t_height = sc.nextInt();

			double t_area = triangleArea(t_base, t_height);
			System.out.println("Your area is " + t_area + " units squared");

		} else if (str.equals("PARALLELOGRAM")) {

			System.out.println("Please enter your base length:");
			int p_base = sc.nextInt();

			System.out.println("Please enter your height");
			int p_height = sc.nextInt();

			double p_area = parallelogramArea(p_base, p_height);
			System.out.println("Your area is " + p_area + " units squared");
		}

	}

	static double triangleArea(int tbase, int theight) {

		double t_area = 0.5 * (tbase * theight);
		return t_area;
	}

	static double parallelogramArea(int pbase, int pheight) {

		double p_area = pbase * pheight;
		return p_area;
	}


}
