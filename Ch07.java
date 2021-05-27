/**
 * <insert_comment_sumamry_here>
 * 
 * @author <Hyunggil Woo>
 */

import java.util.*;
import java.io.*;

public class Ch07{
	public static void main(String[]args){
		Scanner console = new Scanner(System.in);
		int [] nums = {5,2,4,17,55,4,3,26,18,2,17};
		int [] tie = {27, 15, 15, 11, 27};
		mode(tie);
		System.out.println(mode(tie));
		System.out.println();
		median(nums);
		
		integerAdd(console);
		
		
			
		
	}
	 /*This first sorts the array into ascending order. 
	  * Thus, the lower integer will be in the lower index.
	  * Between two integers of same number of mode, the lower integer will win the tie breaker.
	  * 
	*/
	  
	public static int mode (int [] n) {
		
		
		int temp =0;
									
		for (int i =0; i <n.length; i++){ 				// Indexing at the array starts at 0
			for (int j = i + 1; j< n.length; j++){		// Manual indexing begins at 1.
				
				if(n[i] > n[j]){			// If the higher integer with the same number of mode wins the tie breaker,
											// Change if condition to if(n[i] < n[j])
					temp = n[i];
					n[i] = n[j];			
					n[j] = temp;			
				}
			}
		}
			
		int numAppearance = 0;				// Keeps track of the number of times the number was mentioned.
		int modeNum = n[0];					
			
		for (int i=0; i<n.length; i++){		// First for loop checks the index at 0.
			
			int count=0;					// I think I need a second for loop to check at index of 1.
			for (int j=0; j<n.length; j++){ // Second for loop to compares the number from the same index as the outer loop
				
				if(n[i] == n[j]){			
					count++;
					if (count > numAppearance ){ // modeNum updates if the count is greater and modeNum is less than the previous match.
					numAppearance = count;
					modeNum = n[j];				// only if count is greater than 0, modeNum = n[j]
					}
					
				}
			}
		}
		return modeNum;				
	}
		 
		
	
	
	
	
	// I need to shuffle the array in an ascending order and return the medain.
	public static int median (int [] a) {
		
		int temp =0;
									
		for (int i =0; i <a.length; i++){ 				// Indexing at the array starts at 0
			for (int j = i + 1; j< a.length; j++){		// Manual indexing begins at 1.
				
				if(a[i] > a[j]){
					temp = a[i];			// If a[i] is larger than a[j], store it in a temporary variable
					a[i] = a[j];			// Store a[j] in the lower index at a[i].
					a[j] = temp;			// Store the larger number from temp back to a[j]
				}
			}
		}
			
		int c = (a.length)/2;		// initialize the index number for the median.
		return a[c];				
	}
		
		
		
	
	
	public static int [][] matrixAdd (int[][]A, int[][]B) {
		
		
		for (int i=0; i<A.length;i++){
			for (int j=0; j<A[0].length; j++){
				A[i][j] = B[i][j] + A[i][j];
				
			}
		}
		return A;
    }
    
    public static int[] append(int [] list1, int [] list2) {
		int [] n = new int [list1.length + list2.length];
		int counter = 0; 									//initialize an integer to count the indexes of an array
		
		for (int index = 0; index < list1.length; index++){
			n[counter] = list1[index];							// Whichever the index of the array list1 is in, it will be placed in the new array n[]
			counter++;
		}
		for (int index = 0; index < list2.length; index++){
			n[counter] = list2[index];							// Whichever index of array list2 is in, the element will be placed in the new array n[]
			counter++;
		}
		return n;
	}
	
	public static void integerAdd (Scanner console){
		/*There is a scanner, user input, then outputs a large digits of number into an array. 
		 * pre-condition: It accepts two arrays of integers.
		 * How can the user enter the values in each index?
		 * How can I get a large number of 50 digits to be accepted in the scanner
		 * If I store the larger integer as a string, I can create a array length of the string length. 
		 * Then for each index of the string, convert it to an integer, 
		 * then store it in each index of an array.
		 * Q I found there is a way to convert a String into an array of char, but I want an array of integers. 
		 * Q Can I scan a larger integer?
		 */
		
		 Scanner scan = new Scanner(System.in);
		 
		 
		 
		 System.out.print("Please enter the first integer : ");
		 String stng1 = scan.next();
		 int [] num1 = new int [stng1.length()];			//Creates a new array of the length of a string
		 
		 System.out.print("Please enter the second integer : ");
		 String stng2 = scan.next();
		 int [] num2 = new int [stng2.length()];
		 
		 for(int i =0; i <stng1.length(); i++){
		 
		 }	 
	}
}
