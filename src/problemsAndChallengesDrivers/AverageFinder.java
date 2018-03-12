package problemsAndChallengesDrivers;
import java.util.Scanner;
public class AverageFinder {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);  //scanner initialized globally instead
		System.out.print("Enter the limit: ");
		int maxSize = scanner.nextInt();
		int[] numbers = scanArray(maxSize);
		double average = findAverage(numbers);
		System.out.println("Average is "+ average);
	}

	public static int[] scanArray(int maxSize) {
//		Scanner scanner = new Scanner(System.in);
		int[] tempArray = new int[maxSize];
		for(int i=0; i<tempArray.length; i++) {
			System.out.print("\nEnter item number "+i+": ");
			tempArray[i] = scanner.nextInt();
		}
		System.out.println(maxSize+ " Numbers scanned");
		return tempArray;
	}

	public static double findAverage(int[] numbers) {
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		double average = sum/(double)numbers.length;  //type casting the length to double
		return average;
	}
}
