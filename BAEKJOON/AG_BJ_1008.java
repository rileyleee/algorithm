package BAEKJOON;

import java.util.Scanner;

public class AG_BJ_1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		double dA = A;
		double result = dA / B;

		System.out.printf("%.16f", result);

		sc.close();

	}
}
