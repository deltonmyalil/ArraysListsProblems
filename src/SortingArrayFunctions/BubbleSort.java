package SortingArrayFunctions;

//import arrayOperations.ArrayScanPrint;

public class BubbleSort {
	public int[] bubbleSortInt(int[] array){
		int n=array.length;
		int i,j;
		for(i=0; i<n; i++) {
			for(j=0; j<n-i-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}