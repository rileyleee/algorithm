package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AG_BJ_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] rArr = new Integer[n];

		for (int rope = 0; rope < n; rope++) {
			rArr[rope] = sc.nextInt();
		}
		Arrays.sort(rArr, Collections.reverseOrder());

		int max = -1;

		for (int rope = 0; rope < n; rope++) {
			max = Math.max(rArr[rope] * (rope + 1), max);
		}
		System.out.println(max);
		sc.close();
	}
}