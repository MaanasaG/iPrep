package com.org.searching;

public class LinearSearch {

	/***
Best case: The best case occurs when the search term is in the first slot in the array. The number of comparisons in this case is 1.
Worst case: The worst case occurs when the search term is in the last slot in the array, or is not in the array. The number of comparisons in this case is equal to the size of the array. If our array has N items, then it takes N comparisons in the worst case.
Average case: On average, the search term will be somewhere in the middle of the array. The number of comparisons in this case is approximately N/2.
In both the worst case and the average case, the number of comparisons is proportional to the number of items in the array, N. Thus, we say in these two cases that the number of comparisons is order N, or O(N) for short. For the best case, we say the number of comparisons is order 1, or O(1) for short.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int item=10;
       int index=-1;
       int[] list={3,4,7,9,10,11,15,18};
       for (int i=0;i<list.length;i++){
    	   if(list[i]==item){
    		   index=i;
    		   break;
    	   }
       }
		System.out.print("By using linear serach I found the item @ "+index);
	}

}
