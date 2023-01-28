package SWEA;

import java.util.Scanner;

public class AG_swea_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {

			int n = sc.nextInt();

			int[][] snail = new int[n][n];

			int num = 0;
			int i = -1;
			int j = -1;

			while (num != n * n) {

				// j증가
				i++;
				j++;
				while (j != n && snail[i][j] == 0) {
					num++;
					snail[i][j] = num;
					j++;
				}

				// i증가
				j--;
				i++;
				while (i != n && snail[i][j] == 0) {
					num++;
					snail[i][j] = num;
					i++;
				}

				// j감소
				i--;
				j--;
				while (j >= 0 && snail[i][j] == 0) {
					num++;
					snail[i][j] = num;
					j--;
				}

				// i감소
				j++;
				i--;
				while (i >= 0 && snail[i][j] == 0) {
					num++;
					snail[i][j] = num;
					i--;
				}
			}
			// 출력문
			System.out.println("#"+(test + 1));
			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					System.out.print(snail[k][l] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
