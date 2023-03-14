package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_15652 { // 같은 수 허용// 순서는 없음
	static int[] selected;
	static int n;
	static int m;
	static StringBuilder sb;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		selected = new int[m + 1];

		sb = new StringBuilder();
		rec(1);
		System.out.println(sb.toString());

		sc.close();
	}

	private static void rec(int i) {
		// 기저조건
		if (i == m + 1) {
			for (int a = 1; a < selected.length; a++) {
				System.out.println("selected[a]: " + selected[a]);
				sb.append(selected[a]).append(" ");
			}
			sb.append("\n");
		} else {// 재귀조건
			for (int num = 1; num <= n; num++) {
				if (selected[i - 1] <= num) {
					//System.out.println("i: " + i);
					//System.out.println("num: " + num);
					selected[i] = num;
					System.out.println("selected[i]: " + selected[i]);
				}else {
					continue;
				}
				rec(i + 1);
			}
		}
	}
}
