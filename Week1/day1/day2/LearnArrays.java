package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		//int scores=89,34,89,70,;
		
		//literal declaration
		int[] scores= {56,76,89,30,100};
		
		//size of the array -->number of elements in the array
		int size = scores.length; //property of the array
		System.out.println(size);
		
		//to get the element from the array 
		System.out.println(scores[4]); //arrayName[index] -->position of the element
		
		for(int i=0;i<size;i++) {
		System.out.println(scores[i]); //0 1 2 3 4
				}
		
		//how to get the least value from the array
		//to sort the array elements in ascending order
		Arrays.sort(scores);
		System.out.println(scores);
		for(int i=0;i<size;i++) {
				System.out.println(scores[i]); //0 1 2 3 4
					}
		//to print min number from the array
		System.out.println(scores[0]);
		//to print the largest number in the array
		System.out.println(scores[size-1]);
		
		//100, 89, 76,56,30
		System.out.println("Reverse order");
		for(int i=size-1;i>=0;i--)
		
		{
			System.out.println(scores[i]);
		}
		
		
		
	}

}
