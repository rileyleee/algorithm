package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_15651 {
	static int n, m;
	static int[] selected;
	static StringBuilder sb;

	static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		selected = new int[n + 1];
		sc.close();
	}

	public static void main(String[] args) {
		sb = new StringBuilder();

		input();
		recurrence(1);
		System.out.println(sb.toString());
	}

	private static void recurrence(int i) {

		if (i == m + 1) {
			for (int j = 1; j <= m; j++) {
				sb.append(selected[j]).append(' ');
			}
			sb.append('\n');
		} else {
			for (int cand = 1; cand <= n; cand++) {
				selected[i] = cand;
				System.out.println("cand: " + cand);
				System.out.println("i: " + i);
				recurrence(i + 1);
				System.out.println("재귀갔다옴");
				selected[i] = 0;
				System.out.println("0으로 만들었쥬");

			}
		}
	}
}
