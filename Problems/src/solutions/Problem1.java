package solutions;

import solutions.Utils;
import java.util.Random;

public class Problem1 {
	int[] arr;
	int n;
	Utils u = new Utils();
	
	public Problem1() {
		arr = new int[5];
		Random rand = new Random();
		for (int i=0; i<5; i++) {
			arr[i] = (int) (10*rand.nextDouble());
		}
		n = rand.nextInt(12);
	}
	
	public boolean anyTwo(int[] a, int n) {
		for (int i=0; i<a.length; i++) {
			for (int k=0; k<a.length; k++) {
				if (i!=k && (a[i] + a[k] == n)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String []args) {
		Problem1 prob = new Problem1();
		System.out.println("Can any two numbers sum to: " + prob.n);
		prob.u.printIntegerArray(prob.arr);
		if (prob.anyTwo(prob.arr, prob.n)) 
			System.out.println("True");
		
		else System.out.println("False");
	}
}
