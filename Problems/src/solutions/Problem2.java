package solutions;

import java.util.Random;

public class Problem2 {
	int[] arr;
	Utils u = new Utils();
	
	public Problem2() {
		arr = new int[5];
		Random rand = new Random();
		for (int i=0; i<5; i++) {
			arr[i] = (int) (5*rand.nextDouble()+1);
		}
	}
	
	public static void main(String []args) {
		Problem2 prob = new Problem2();
		prob.u.printIntegerArray(prob.arr);
		int p = 1;
		
		for (int i=0; i<prob.arr.length; i++) {
			p *= prob.arr[i];
		}
		for (int i=0; i<prob.arr.length; i++) {
			prob.arr[i] = p / prob.arr[i];
		}
		System.out.println("------");
		prob.u.printIntegerArray(prob.arr);
	}
}
