package solutions;

public class Utils {
	public void printIntegerArray(int[] arr) {
		System.out.print("The array: [");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) System.out.print(" ");
		}
		System.out.println("]");
	}
}
