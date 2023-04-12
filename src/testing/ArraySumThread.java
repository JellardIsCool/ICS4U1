package testing;

/* Demonstration Program for Presentation on Threads. By Ayan and Anish */

public class ArraySumThread extends Thread {
    private static int numOfIndexes = 0;
    private final int[] array;
    private final int start;
    private final int end;
    private int sum;
    private Boolean stop = false;

    public ArraySumThread(int[] array, int start, int end, String name) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.setName(name);
    }

    public void run() {
        for (int i = start; i <= end && !stop; i++) {
            sum += array[i];
            numOfIndexes++;
            // shows the current sum that a thread is on
            // try uncommenting
            System.out.println("Thread " + getName() + " current sum: " + sum);
        }
    }

    public void stopThread() {
        stop = true;
    }

    public int getSum() {  
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        // simulate a large data set
        int size = 100;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = 1;

        //Create 2 threads to complete the task
        ArraySumThread thread1 = new ArraySumThread(array, 0, size/2 - 1, "1");
        ArraySumThread thread2 = new ArraySumThread(array, size/2, size - 1, "2");

        //Start the threads
        thread1.start();
        thread2.start();

        // Check if threads are still running
        // Comment it out, as it can get annoying
//        while (thread1.isAlive() || thread2.isAlive()) {
//            System.out.println("Threads are still running...");
//        }

        /*
           - Waits for the threads to finish
           - Without join(), the main thread would exit before the two threads complete their tasks.
           - We would not get the correct result.
         */
        // Uncomment/comment this as needed
       thread1.join();
       thread2.join();

        // Stops a thread, try adding a condition to cause the thread to end
       thread1.stopThread();
       thread2.stopThread();


        //Get the sum from each thread and add them together
        int sum = thread1.getSum() + thread2.getSum();

        System.out.println("Sum: " + sum);
        System.out.println ("Numbers looped through: " + numOfIndexes);
    }
}