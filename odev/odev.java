package odev;

public class odev {
	
	    public static void main(String[] args) {
	        int n = 27; // Replace 27 with any positive integer less than 1 million
	        
	        System.out.println("Ulam function for n = " + n + ":");
	        while (n != 1) {
	            System.out.print(n + " ");
	            if (n % 2 == 0) {
	                n = n / 2;
	            } else {
	                n = n * 3 + 1;
	            }
	        }
	        System.out.println(1); // Add 1 at the end of the sequence
	    }
	}


