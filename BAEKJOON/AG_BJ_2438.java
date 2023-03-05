package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2438 { // 3분 소요

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
