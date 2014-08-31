package com.org.sorting;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A={3,9,1,6,28,5};
		int start=0;
	    int end= A.length;
		quicksort(A,start,end);
		for (int k=0;k<A.length-1;k++){
			System.out.print(A[k]+",");
		}
			
		
	}
	private static void quicksort(int[] a,int start,int end) {
		if(start<end){
		
		int pIndex=Partition(a,start,end);
		quicksort(a,start,pIndex-1);
		quicksort(a,pIndex+1,end);
		
		}
		
		
	}
	private static int Partition(int[] a, int start,int end) {
		int pivot=a[end];
		int pIndex=start;
		for(int i=start;i<end;i++){
			if(a[i]<pivot){
				swap(a,a[i],a[pIndex]);
			}
			pIndex++;
			swap(a,pIndex,pivot);
		}
		
		
		
		return pIndex;
	}
	private static void swap(int[] a, int i, int j) {
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		
	}
}
