package algorithm.SWEA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AG_swea_1983 {
	public static void main(String[] args) { // 36분 소요

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			Double[] scores = new Double[n];

			String[] credit = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

			for (int s = 0; s < n; s++) {
				scores[s] = sc.nextInt() * 0.35 + sc.nextInt() * 0.45 + sc.nextInt() * 0.2;
			}

			Double target = scores[k - 1];

			Arrays.sort(scores, Collections.reverseOrder());

			for (int i = 0; i < n; i++) {
				if (target == scores[i]) {
					int targetIdx = i * 10 / n; // 비율 계산이 안될 때는 비례식을 사용하자.
					System.out.println("#" + t + " " + credit[targetIdx]);
				}
			}
		}
		sc.close();
	}
}