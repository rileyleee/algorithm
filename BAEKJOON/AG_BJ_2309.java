package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_2309 { // 15분 소요 -> 완전탐색 시 인덱스 유의
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] height = new int[9];

		for (int h = 0; h < 9; h++) {
			height[h] = sc.nextInt();
		}

		Arrays.sort(height);

		int sum = 0;
		int villian1 = 0;
		int villian2 = 0;

		outer: for (int i = 0; i <= height.length - 2; i++) {
			for (int j = i + 1; j <= height.length - 1; j++) {
				sum = 0;
				for (int h = 0; h <= height.length - 1; h++) {
					sum += height[h];
				}
				if (sum - height[i] - height[j] == 100) {
					villian1 = i;
					villian2 = j;
					break outer;
				}
			}
		}

		for (int h = 0; h <= height.length - 1; h++) {
			if (h != villian1 && h != villian2) {
				System.out.println(height[h]);
			}
		}
		sc.close();
	}
}