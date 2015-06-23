/***********************************************************************************
 * FILENAME: triangle.java
 * 
 * Tue 23 June, 12:15 PM, 2015
 *
 * Author: Yu Zhou
 * 
 * homework 1 - 1a
 * create a program that prints the following figure.

	*
	**
	***
	****
	*****

***********************************************************************************/

public class triangle{
	public static void main(String[] args) {
		 for(int x = 0; x < 5; x++){
		 	for (int y = 0; y < x+1 ; y++){
              System.out.print("*");
		 	}
		 	System.out.print("\n");
         }
	}
}