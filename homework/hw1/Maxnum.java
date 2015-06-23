/***********************************************************************************
 * FILENAME: Maxnum.java
 * 
 * Tue 23 June, 12:55 PM, 2015
 *
 * Author: Yu Zhou
 * 
 * homework 1 - 2

* create a function with the signature public static int max(int[] m) that 
* returns the maximum value of an int array.

***********************************************************************************/


public class Maxnum{
   public static int max(int[] m) {
   	int num_max = 0;
	for(int i = 0; i < m.length; i ++){
		if (m[i] > num_max){
			num_max = m[i];
		}
	}	
	System.out.println(num_max);
	return 0;
	}


   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      max(numbers);   
   }
}