package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1984 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int[] midAvg = new int[10];
			for (int n = 0; n < 10; n++) {
				midAvg[n] = sc.nextInt();
			}
			Arrays.sort(midAvg);

			int sum = 0;
			for (int a = 1; a < midAvg.length - 1; a++) {
				sum += midAvg[a];
			}

			int avg = (int) Math.round(sum / 8.0);
			System.out.println("#" + t + " " + avg);
		}
		sc.close();
	}
}