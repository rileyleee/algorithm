package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) { // i=0
			for (int j = 0; j < n - 1 - i; j++) { // j=4
				System.out.print(" ");
			}
			for (int k = n - i; k <= n; k++) { // k=1
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}