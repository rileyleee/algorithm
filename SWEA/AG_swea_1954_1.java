package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1954_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			int n = sc.nextInt();

			int[][] snail = new int[n][n];

			// 방향 전환 델타 배열
			int[] dr = { 0, 1, 0, -1 };
			int[] dc = { 1, 0, -1, 0 };

			int cnt = 0;
			int nums = 0;
			int r = 0;
			int c = 0;
			snail[r][c] = ++cnt;
			nums++;

			while (nums != (n * n)) {

				// 우
				r = r + dr[0];
				c = c + dc[0];
				while (c != n && snail[r][c] == 0) {
					snail[r][c] = ++cnt;
					nums++;
					r = r + dr[0];
					c = c + dc[0];
				}
				r = r - dr[0];
				c = c - dc[0];

				// 하
				r = r + dr[1];
				c = c + dc[1];
				while (r != n && snail[r][c] == 0) {
					snail[r][c] = ++cnt;
					nums++;
					r = r + dr[1];
					c = c + dc[1];
				}
				r = r - dr[1];
				c = c - dc[1];

				// 좌
				r = r + dr[2];
				c = c + dc[2];
				while (c >= 0 && snail[r][c] == 0) {
					snail[r][c] = ++cnt;
					nums++;
					r = r + dr[2];
					c = c + dc[2];
				}
				r = r - dr[2];
				c = c - dc[2];

				// 상
				r = r + dr[3];
				c = c + dc[3];
				while (r >= 0 && snail[r][c] == 0) {
					snail[r][c] = ++cnt;
					nums++;
					r = r + dr[3];
					c = c + dc[3];
				}
				r = r - dr[3];
				c = c - dc[3];
			}
			System.out.println("#" + (t + 1) + " ");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}