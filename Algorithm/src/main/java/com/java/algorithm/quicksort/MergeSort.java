package com.java.algorithm.quicksort;
//Reference link http://www.java2novice.com/java-sorting-algorithms/merge-sort/

/*Steps to implement Merge Sort:
1) Divide the unsorted array into n partitions, each partition contains 1 element. Here the one element is considered as sorted.
2) Repeatedly merge partitioned units to produce new sublists until there is only 1 sublist remaining. This will be the sorted list at the end.
*/
public class MergeSort {
	private int[] array;
	private int[]tempMergArr;
	private int length;
	
	public void sort(int[] arr){
		this.array = arr;
		this.length =arr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0,length-1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
        
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
	
	public void mergeParts(int lowerIndex,int middle,int higherIndex){
		for(int i=lowerIndex;i<=higherIndex;i++){
			tempMergArr[i] =array[i];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i <= middle && j <= higherIndex){
			if(tempMergArr[i]<= tempMergArr[j]){
				array[k] = tempMergArr[i];
				i++;
			}else{
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k] =tempMergArr[i];
			k++;
			i++;
		}
	}
	
	public static void main(String a[]){
        
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
