package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] test = new int[10];

		for (int i = 1; i < t + 1; i++) {
			int max = 0;
			for (int j = 0; j < 10; j++) {
				test[j] = sc.nextInt();
				if (test[j] > max) {
					max = test[j];
				}
			}
			System.out.println("#" + i + " " + max);
		}
		sc.close();
	}
}
