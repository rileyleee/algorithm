package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			System.out.printf("Case #%d: %d \n", t, sc.nextInt() + sc.nextInt());
		}
		sc.close();
	}
}
