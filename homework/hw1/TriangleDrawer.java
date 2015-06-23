/***********************************************************************************
 * FILENAME: triangle.java
 * 
 * Tue 23 June, 12:40 PM, 2015
 *
 * Author: Yu Zhou
 * 
 * homework 1 - 1b
 * The drawTriangle method should take one parameter named N
 * and it should print out a triangle with N asterisks tall 

	*
	**
	***
	****
	*****
	.............

***********************************************************************************/

import java.util.Scanner;  //user input


public class TriangleDrawer {
   public static void drawTriangle(int N) {
   	for(int x = 0; x < N; x++){
 		 	for (int y = 0; y < x+1 ; y++){
              System.out.print("*");
		 	}
		 	System.out.print("\n");
         }
   }

   
   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a;
		System.out.println("Please enter a number!");
	   	a = in.nextInt();

	   	drawTriangle(a);

   }
}