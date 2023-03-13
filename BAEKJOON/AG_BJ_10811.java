package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] bucket = new int[n + 1];
		int[] change = new int[n + 1];

		for (int i = 1; i < bucket.length; i++) {
			bucket[i] = i;
			change[i] = i;
		}

		for (int i = 0; i < m; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int j = b; j >= a; j--) {
				change[b - j + 1] = bucket[j];
				// System.out.println("템프" + Arrays.toString(change));
			}
			int k = 1;
			for (int j = a; j <= b; j++) {
				bucket[j] = change[k++];
				// System.out.println("버킷" + Arrays.toString(bucket));
			}
		}

		for (int i = 1; i < bucket.length; i++) {
			System.out.print(bucket[i] + " ");
		}
		sc.close();
	}
}