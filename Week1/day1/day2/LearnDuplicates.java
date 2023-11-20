package week1.day2;

import java.util.Arrays;

public class LearnDuplicates {

	public static void main(String[] args) {
		int[] input = {12,13,13,14,15,12};
		//Method:1
		//Sort the array
		/*
		 * Arrays.sort(input); for(int i=0;i<input.length-1;i++) {
		 * if(input[i]==input[i+1]) { //input[0]==input[1] System.out.println(input[i]);
		 * } }
		 */

		//Method:2 -nested loop
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j]) {
					System.out.println("The duplicated value is " +input[i]);
				}
				
			}
		}
		
	}

}
