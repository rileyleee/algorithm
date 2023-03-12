package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", t, a, b, a + b);
		}
		sc.close();
	}
}
