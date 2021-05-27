/**
 * <insert_comment_sumamry_here>
 * 
 * @author <Hyunggil Woo>
 */

import java.util.*;
import java.io.*;

public class Ch07{
	public static void main(String[]args){
		
		int [] nums = {5,2,4,17,55,4,3,26,18,2,17};
		
		
		median(nums);
		//int c = (nums.length)/2;
		//System.out.println(Arrays.getInt(nums, c));	
		
			
		
	}
	
	public static int mode(int[] n){
		 
		int[] counts = new int[101];
		int maxCount = 0;
		int maxKey = -1;
		
		for(int i = 0; i < n.length; i++) {
			counts[n[i]]++;
			if(counts[n[i]] > maxCount) {
				maxCount = counts[n[i]];
				maxKey = n[i];
			}
		}
		
		return maxKey;
	}
	
	public static void shuffle (int [] aray) {
		Random rand = new Random();
		for (int i =0; i < aray.length; i++){
			int temp = aray[i];
			int j = rand.nextInt(aray.length);
			aray[i] = aray[j];
			aray[j] = temp;
		}
	}
	
	// I need to shuffle the array in an ascending order and return the value in the middle.
	public static int median (int [] a) {
		
		int temp =0;
									// integer to count the index of the median
		
		
		for (int i =0; i <a.length; i++){ 				// Indexing at the array starts at 0
			for (int j = i + 1; j< a.length; j++){		// Manual indexing begins at 1.
				
				if(a[i] > a[j]){
					temp = a[i];			// If a[i] is larger than a[j], store it in a temporary variable
					a[i] = a[j];			// Store a[j] in the lower index at a[i].
					a[j] = temp;			// Store the larger number from temp back to a[j]
				}
			}
			
		}
			
		int c = (a.length)/2;
				// Finds the aray element in the middle of the array.
		
		return a[c];				// I think using Array.getInt(Object [] array, int index) will help me get the median
									// How do I find the index of the median?
		

	}
		
		
		
	
	
	public static void matrixAdd () {
		int [][] A;
		int [][] B;
		int [][] C;
		//C[][] = A[i][j] + B[i][j];
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
}
