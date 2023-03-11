package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] dice = new int[7];
		int max = 0;
		int num = 0;
		for (int d = 0; d < 3; d++) {
			num = sc.nextInt();
			dice[num]++;
			if (max < num) {
				max = num;
			}
		}

		int result = 0;
		for (int d = 1; d < dice.length; d++) {
			if (dice[d] == 3) {
				result = 10000 + d * 1000;
				break;
			} else if (dice[d] == 2) {
				result = 1000 + d * 100;
				break;
			}
		}

		if (result == 0) {
			result = max * 100;
		}
		System.out.println(result);
		sc.close();
	}
}