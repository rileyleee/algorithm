package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_15706_2 { // 20분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int kMin = sc.nextInt();
			int kMax = sc.nextInt();

			int[] scores = new int[n];
			int max = Integer.MIN_VALUE;
			for (int s = 0; s < n; s++) {
				scores[s] = sc.nextInt();
				max = Math.max(max, scores[s]);
			}
			int c1 = 0;
			int c2 = 0;
			int c3 = 0;
			int minimum = Integer.MAX_VALUE;
			int diff = Integer.MAX_VALUE;
			boolean possible = false;
			for (int i = 2; i <= 99; i++) {
				for (int j = i + 1; j <= 100; j++) {
					c1 = 0;
					c2 = 0;
					c3 = 0;
					diff = 0;
					for (int a = 0; a < n; a++) {
						if (scores[a] < i) {
							c1++;
						} else if (scores[a] >= i && scores[a] < j) {
							c2++;
						} else if (scores[a] >= j) {
							c3++;
						}
					}
					if (c1 >= kMin && c1 <= kMax && c2 >= kMin && c2 <= kMax && c3 >= kMin && c3 <= kMax) {
						diff = Math.max(Math.max(c1, c2), c3) - Math.min(Math.min(c1, c2), c3);
						minimum = Math.min(minimum, diff);
						possible = true;
					}
				}
			}
			if (!possible) {
				System.out.println("#" + t + " " + -1);
			} else {
				System.out.println("#" + t + " " + minimum);
			}
		}
		sc.close();
	}
}
