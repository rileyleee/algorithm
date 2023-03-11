package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int sSum = 0;
		for (int n = 0; n < num.length; n++) {
			num[n] = sc.nextInt();
			sSum += num[n] * num[n];
		}

		int vNum = sSum % 10;
		System.out.println(vNum);

		sc.close();
	}
}
