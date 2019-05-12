package com.java.algorithm.quicksort;

public class BubbleSort {
	//Reference : http://www.java2novice.com/java-sorting-algorithms/bubble-sort/
	
	public static void bubbleSort(int arr[]){
		int n = arr.length;
		int k;
		for(int m =0; m<=n; m++){
			int temp;
			for(int i = 0;i<n-1;i++){
				k = i+1;
				if(arr[i] > arr[k]){
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
			printNumbers(arr);
		}
	}
	
	
	private static void printNumbers(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+",");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		int[] input ={ 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
	}
}
