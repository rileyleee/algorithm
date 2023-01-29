package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rightnum = { 1, 1, 2, 2, 2, 8 };
		int[] wrongnum = new int[6];

		for (int i = 0; i < 6; i++) {
			wrongnum[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			int dif = rightnum[i] - wrongnum[i];
			System.out.print(dif + " ");
		}
		sc.close();
	}
}