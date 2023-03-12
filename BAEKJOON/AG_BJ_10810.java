package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] cnt = new int[n + 1];
		for (int a = 0; a < m; a++) {
			int s = sc.nextInt();
			int f = sc.nextInt();
			int num = sc.nextInt();
			for (int i = s; i <= f; i++) {
				cnt[i] = num;
			}
		}
		for (int i = 1; i < cnt.length; i++) {
			System.out.print(cnt[i] + " ");
		}
		sc.close();
	}
}