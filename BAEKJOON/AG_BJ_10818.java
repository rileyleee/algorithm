package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(min+" "+max);
		sc.close();
	}
}