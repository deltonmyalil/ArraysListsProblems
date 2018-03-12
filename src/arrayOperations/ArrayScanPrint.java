package arrayOperations;

import java.util.Scanner;

public class ArrayScanPrint {
	private static Scanner scanner = new Scanner(System.in);

	public void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public int[] scanArray() {
		System.out.print("Enter maxsize: ");
		int maxsize = scanner.nextInt();
		int[] array = new int[maxsize];
		for(int i=0; i<maxsize; i++) {
			System.out.print("Enter element " + i +":");
			array[i] = scanner.nextInt();
		}
		return array;
	}

}
