package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nums = sc.nextInt();
		int norm = sc.nextInt();
		int[] numArr = new int[nums];

		for (int i = 0; i < nums; i++)
			numArr[i] = sc.nextInt();

		for (int i = 0; i < nums; i++)
			if (numArr[i] < norm) {
				System.out.print(numArr[i] + " ");
			}
		sc.close();
	}
}
