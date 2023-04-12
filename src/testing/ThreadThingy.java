package testing;

public class ThreadThingy extends Thread {
	
	String name1;
	int start;

	public static void main(String[] args) {
		
		ThreadThingy thread1 = new ThreadThingy("first ball", 10);
		ThreadThingy thread2 = new ThreadThingy("second ball", 16);
		
		thread1.start();
		thread2.start();

	}

	ThreadThingy(String name1, int start){
		this.start = start;
		this.setName(name1);
		
	}

	public void run() {

		for (int i = start; i > 0; i--) {
			System.out.println(i);
		}

	}

}
