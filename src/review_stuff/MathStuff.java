package review_stuff;

public class MathStuff {

	public static void main(String[] args) {

		/*** INTEGERS ***/
		int y = 0;		
		//int z = 5/y;  // Divide by zero crashes the program

		y = 28/10;
		System.out.println(y);  
		//Integer division truncates decimals.   2.8 --> 2

		//Big positive numbers wrap around to big negative numbers
		int big = 2_000_000_000;  //2 billion
		System.out.println( big * 10);

		big = Integer.MAX_VALUE;
		System.out.println(big);
		big++;
		System.out.println(big);

		/*** DECIMALS ***/
		double a = 5.5 / 0 ;
		System.out.println(a); 
		//divide by zero makes infinity (or -infinity)

		//square root of -5
		a = Math.sqrt(-5);
		System.out.println(a);
		//invalid math operations become NaN (not a number)

		//calculate 28 divided by 10
		a = 28.0/10;	// or  28/10.0 
		System.out.println(a);

		//bigger than the biggest double ... becomes Infinity
		double huge = Double.MAX_VALUE;
		System.out.println(huge);
		huge *= 2;
		System.out.println(huge);

		// math problems with rounding
		double z = 1234.0;
		z = z * 0.1;
		z = z * 0.1;
		System.out.println(z);  //it should be 12.34 
		//Integer math is exact. Double math is not!!


	}

}