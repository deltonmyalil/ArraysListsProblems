package problemsAndChallengesDrivers;

import arrayOperations.ArrayScanPrint;
import arrayOperations.ReverseArray;
import SortingArrayFunctions.BubbleSort;

public class BubbleSortDriver {
	public static void main(String[] args){
		BubbleSort bubbleSort = new BubbleSort();
		ArrayScanPrint arrayScanPrint = new ArrayScanPrint();
		ReverseArray reverseArray = new ReverseArray();
		int[] array = arrayScanPrint.scanArray();
		int[] sortedArray = bubbleSort.bubbleSortInt(array);
		arrayScanPrint.printArray(sortedArray);
	}
}
