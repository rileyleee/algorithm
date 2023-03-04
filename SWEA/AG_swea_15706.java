package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_15706 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {

			int p = sc.nextInt();
			int minP = sc.nextInt();
			int maxP = sc.nextInt();

			int[] score = new int[p];

			int max = -1;
			int min = 101;
			for (int s = 0; s < p; s++) {
				score[s] = sc.nextInt();
				if (score[s] > max) {
					max = score[s];
				} else if (score[s] < min) {
					min = score[s];
				}
			}
			boolean impossible = false;
			int minimum = Integer.MAX_VALUE;
			int diff = Integer.MAX_VALUE;
			for (int i = 2; i <= max - 1; i++) {
				for (int j = i + 1; j <= max; j++) {

					int A = 0;
					int B = 0;
					int C = 0;

					for (int s = 0; s < score.length; s++) {
						if (score[s] < i)
							A++;
						else if (score[s] >= i && score[s] < j)
							B++;
						else if (score[s] >= j)
							C++;
					}

					if (A >= minP && A <= maxP && B >= minP && B <= maxP && C >= minP && C <= maxP) {
						int mx = Math.max(Math.max(A, B), C);
						int mn = Math.min(Math.min(A, B), C);
						diff = mx - mn;
						if (diff < minimum) {
							minimum = diff;
						}
						impossible = false;
					} else {
						if (minimum == Integer.MAX_VALUE) {
							impossible = true;
						}
					}
				}
			}
			if (impossible) {
				System.out.println("#" + (t + 1) + " " + -1);
			} else {
				System.out.println("#" + (t + 1) + " " + minimum);
			}
		}
		sc.close();
	}
}