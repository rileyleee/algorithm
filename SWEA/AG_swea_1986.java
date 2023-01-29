package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int j = 0; j < T; j++) {
			int N = sc.nextInt();
			int result = 0;

			for (int i = 1; i < N + 1; i++) {
				if (i % 2 == 0) {
					result -= i;
				} else {
					result += i;
				}
			}
			System.out.println("#" + (j + 1) + " " + result);
		}
		sc.close();
	}
}