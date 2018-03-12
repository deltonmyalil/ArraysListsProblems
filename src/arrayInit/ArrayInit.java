package arrayInit;

public class ArrayInit {
	public static void main(String[] args) {
		int myArray[];
		myArray = new int[10];  //Two line declaration

		int[] nextArray = new int[10];  //Single line declaration of size 15
		nextArray[5] = 67; //Adding 67 to the 6th element

		double[] doubleArray = new double[10];
		System.out.println(nextArray[5]);
		System.out.println(nextArray[6]); //All elements dy default init to 0

		int[] initArray = {3,2,4,1,6,4,7};  //init during decl
		System.out.println(initArray[0]);

		int multiplier = 10;  //using functions to scan and print array
		int[] anotherArray = scanArray(multiplier);
		printArray(anotherArray);
	}

	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static int[] scanArray(int multiplier) {
		int anotherArray[] = new int[10];
		for(int i=0; i<anotherArray.length; i++) {
			anotherArray[i] = i*multiplier;
		}
		return anotherArray;
	}
}
