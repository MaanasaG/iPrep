package com.org.sorting;

public class InsertionSort {

	
	public static void main(String[] args) {
		int[] A={3,9,1,6,28,5};
		int[] insertionSorted=InsertionSorter(A);
		System.out.print("\nInsertion sort  Result ");
        for(int i:insertionSorted){
            System.out.print(i);
            System.out.print(", ");
        }
	}

		public static int[] InsertionSorter(int[] data) {
			for (int i =0; i < data.length; i++) {
				int current = data[i];
				int j = i-1;
				while (j >=0 && data[j] >= current) {
					data[j+1] = data[j];
					j--;
				}
				data[j+1] = current;
			}
		return data;
		
	}

}
