package testing;

import java.util.Scanner;

public class anishHasGiganticTesticles {
    
    final static int length = 20;
    final static String input = "The unusually warm weather makes me think of summer. It is hard to stay focused on mundane work.";
    
    public static void main(String[] args) {
        String nextInQueue = "";
        int position = 0;
        
        //System.out.println("*".repeat(length+4));
        
        for (int i = 0; i < length + 4; i++) {
        	System.out.print("*");
        }
        System.out.println("");
        
        nextInQueue = input.substring(0, length + 1);
        position = length;
        while (true) {
            Scanner sc = new Scanner(nextInQueue);
            
            if (nextInQueue.length() < length - 1) {
                System.out.printf("* %-" + length + "s *%n", nextInQueue.substring(0, nextInQueue.length() - 1));
            } else {
                System.out.printf("* %-" + length + "s *%n", nextInQueue.substring(0, length - 1));
            }
            sc.close();
            if (position >= input.length()) break;
            
            if (position+length >= input.length()) {
                int prevPos = position;
                position = input.length()-length;
                nextInQueue = input.substring(prevPos, input.length()) + " ";
            } else {
                nextInQueue = input.substring(position, position + (length+1));
            }
            position += length;
        }
        
        System.out.println("*".repeat(length+4));
    }
}