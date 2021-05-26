/**
 * <insert_comment_sumamry_here>
 * 
 * @author <Hyunggil Woo>
 */

import java.util.*;
import java.io.*;

public class Ch07{
	public static void main(String[]args){
		
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
	
	public static void matrixAdd () {
		int [][] A;
		int [][] B;
		int [][] C;
		//C[][] = A[i][j] + B[i][j];
    }
    
    public static void append(int [] list1, int [] list2) {
		int [] n = new int [list1.length + list2.length];
	}
}
