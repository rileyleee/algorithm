package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			int[] Narr = new int[N];
			int[] Marr = new int[M];

			for (int n = 0; n < N; n++) {
				Narr[n] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(Narr));

			for (int m = 0; m < M; m++) {
				Marr[m] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(Marr));

			int max = -1;
			if (N < M) {
				for (int i = 0; i < M - N + 1; i++) {
					int sum = 0;
					for (int m = i, n = 0; m < N + i; m++, n++) {
						sum += Narr[n] * Marr[m];
//						System.out.println("Narr[n]: " + Narr[n]);
//						System.out.println("Marr[m]: " + Marr[m]);
					}
//					System.out.println("sum: " + sum);
					max = Math.max(max, sum);
				}
				System.out.println("#" + t + " " + max);
			} else {
				for (int i = 0; i < N - M + 1; i++) {
					int sum = 0;
					for (int n = i, m = 0; n < M + i; n++, m++) {
						sum += Marr[m] * Narr[n];
//						System.out.println("Marr[m]: " + Marr[m]);
//						System.out.println("Narr[n]: " + Narr[n]);
					}
//					System.out.println("sum: " + sum);
					max = Math.max(max, sum);
				}
				System.out.println("#" + t + " " + max);
			}
		}
		sc.close();
	}
}