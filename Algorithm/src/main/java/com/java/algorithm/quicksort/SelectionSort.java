package com.java.algorithm.quicksort;
//Reference link: http://www.java2novice.com/java-sorting-algorithms/selection-sort/
public class SelectionSort {
	public static int[] selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++)
		{
			int index = i;
			for(int j = i+1;j < arr.length; j++)
				if(arr[j]<arr[index])
					index =j;

				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] =temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,34,2,56,7,67,88,42};
		int[] arr2 =selectionSort(arr1);
		for(int i :arr2){
			System.out.println(i);
			System.out.println(",");
		}
	}
}
