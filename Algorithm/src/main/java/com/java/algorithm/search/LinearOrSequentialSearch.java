package com.java.algorithm.search;
//Reference link https://www.java2novice.com/java-search-algorithms/linear-search/

/*Linear search or sequential search is a method for finding a particular value in a list, 
that consists of checking every one of its elements, 
one at a time and in sequence, until the desired one is found.*/
public class LinearOrSequentialSearch {
	
	public static int linearSearch(int[] inputArr, int key) {
		for (int i = 0; i < inputArr.length; i++) {
			if (key == inputArr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		 int[] arr1= {23,45,21,55,234,1,34,90};
		 int searchKey = linearSearch(arr1, 55);
		 System.out.println("searchKey found at index: "+searchKey);
		 int[] arr2= {123,445,421,595,2134,41,304,190};
		 int searchKey1 = linearSearch(arr2, 41);
		 System.out.println("searchKey1 found at index: "+searchKey1);
	}
}
