/*
 * Andrew Polley
 * Assignment 12
 * Due 4-19-16
 * Java 2
 * ********************
 * Project Euler 30
 * ********************
 * References
 * https://answers.yahoo.com/question/index?qid=20080123161405AAFrnc6
 * http://www.mkyong.com/java/java-convert-int-to-integer-example/
 * Bill Nicholson <--the math part
 * 
 */


package pe30;

import java.util.Scanner;

public class PE30 {

	// public static void main(String[] args) { //was only the main for testing. 
	
	public static int E30() {

		

		int r = 0; // r for result
		// an array of integers (went ahead and did the numbers to the nth
		int n; //n for nth. able to be user-definable
		//allows user to define which power they want
		Scanner scanner = new Scanner (System.in);
		n = scanner.nextInt();
		//math.pow wants a double, but i wanted an integer. eclipse suggested a cast
		int z = (int) Math.pow(0, n);
		int y = (int) Math.pow(1, n);
		int a = (int) Math.pow(2, n); 
		int b = (int) Math.pow(3, n);
		int c = (int) Math.pow(4, n);
		int d = (int) Math.pow(5, n);
		int e = (int) Math.pow(6, n);
		int f = (int) Math.pow(7, n);
		int g = (int) Math.pow(8, n);
		int h = (int) Math.pow(9, n);
		
		//put the above values into an array
		Integer[] toNth = {z, y, a, b, c, d, e, f, g, h};
		//i increases till it hits one number below the upper. then sets number (num) to be i
		for (int i = 10; i < 9999999; i++) { 
			int num = i;
			int total = 0;//initialize total
			while (num > 0) {//number will surely be more than 0
				
				//thanks Bill for the hints				 
				total = total + toNth[num % 10];
				num = (num / 10);
			}
			if (total == i) {
				r = r + total;
				//I wanted to see all the numbers as shown on the problem with x^4 as the example
				 System.out.println("A number leading up to the total is: " + total); 
				 
			}
		}
		return r; // return r (result)

	}
}
