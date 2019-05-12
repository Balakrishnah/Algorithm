package com.java.algorithm.quicksort;
//Reference link :http://www.java2novice.com/java-sorting-algorithms/quick-sort/
/*Steps to implement Quick sort:
1) Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
2) Reorder the list so that all elements with values less than the pivot come before the pivot, 
while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.
3) Recursively apply the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with greater values.
*/
public class Quicksort {
	private int array[];
	private int length;
	
	public void sort(int[] inputArr){
		if(null == inputArr || 0 == inputArr.length){
			return;
		}
		this.array =inputArr;
		length = inputArr.length;
		quickSort(0,length-1);
	}
	private void quickSort(int lowerIndex,int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		//divide into two arrays
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumbers(i, j);
				//move index to next position on both sides
				i++;
				j--;
			}			
		}
		
		// call quickSort() method recursively
		if(lowerIndex < j)
			quickSort(lowerIndex, j);
		if(i<higherIndex)
			quickSort(i, higherIndex);
	}
	
	private void exchangeNumbers(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		Quicksort quicksort = new Quicksort();
		int[] input ={24,2,45,20,56,75,2,56,99,53,12};
		quicksort.sort(input);
		for(int i :input){
			System.out.println(i);
			System.out.println(" ");
		}
	}
}
