

package Homework;

import java.util.Scanner;

public class Del1entry {	
public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter two three digit Integers with a space to seperate them. Then hit enter:");
	
	String Int1 = scnr.next(); //Using string to scan for int
	String Int2 = scnr.next(); //In order to check for characters
	
	 //below finds if sum of the 1st, 2nd, and 3rd char, of 
	 if ( (Int1.charAt(0) + Int2.charAt(0)) == (Int1.charAt(1) + Int2.charAt(1)) 
			 && (Int1.charAt(1) + Int2.charAt(1)) == (Int1.charAt(2) + Int2.charAt(2))) {
		 System.out.println("True");
	 }
	 else {
		 System.out.println("False");
	 }
}

}

