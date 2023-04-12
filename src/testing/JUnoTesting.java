package testing;

public class JUnoTesting {

	int x = 3;
	
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	public boolean straightLean() {
		return x == 2;
	}
	
	private int [] array1 = {8, 0, -17};
	private int [] array2 = {8, 0, 99};
	
	public int[] arrayOneMethod() {
		return array1;
	}
	
	public int[] arrayTwoMethod() {
		return array2;
	}
	
}
