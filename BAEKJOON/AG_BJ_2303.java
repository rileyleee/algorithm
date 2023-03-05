package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] card = new int[n][5];

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < 5; c++) {
				card[r][c] = sc.nextInt();
			}
		}
		int sum = -1;
		int max = -1;
		int remainder = -1;

		int[] maxArr = new int[n];

		for (int r = 0; r < n; r++) {
			max = -1;
			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j < 4; j++) {
					for (int k = j + 1; k < 5; k++) {
//						System.out.println(i + "," + j + "," + k);
						sum = card[r][i] + card[r][j] + card[r][k];
						remainder = sum % 10;
						max = Math.max(remainder, max);
						maxArr[r] = max;
					}
				}
			}
		}
		int who = -1;
		int whoIdx = -1;

		for (int i = 0; i < maxArr.length; i++) {
			if (maxArr[i] >= who) {
				who = maxArr[i];
				whoIdx = i + 1;
			}
		}

//		System.out.println(Arrays.toString(maxArr));
		System.out.println(whoIdx);

		sc.close();

	}

}

//		for (int r = 0; r < n; r++) {
//			for (int c = 0; c < 5; c++) {
//				System.out.print(card[r][c]);
//			}
//			System.out.println();
//		}