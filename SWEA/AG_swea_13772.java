package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13772 {
	public static int[][] bomb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			bomb = new int[n][n];
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					bomb[r][c] = sc.nextInt();
				}
			}
			// 십자모양
			int sum = 0;
			int max = -1;
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					sum = 0;
					sum += bomb[r][c];
					sum += pBomb(r, c, p);
					max = Math.max(max, sum);
				}
			}
			// 엑스모양
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					sum = 0;
					sum += bomb[r][c];
					sum += dBomb(r, c, p);
					max = Math.max(max, sum);
				}
			}
			System.out.println("#" + t + " " + max);
		}
		sc.close();
	}

	private static int pBomb(int r, int c, int p) {
		int pSum = 0;
		int or = r;
		int oc = c;
		int[] dr = { -1, 1, 0, 0 }; // 상하좌우
		int[] dc = { 0, 0, -1, 1 };
		for (int i = 0; i < dr.length; i++) {
			r = or;
			c = oc;
			for (int j = 1; j <= p; j++) {
				r = r + dr[i];
				c = c + dc[i];
				if (r >= 0 && r <= bomb.length - 1 && c >= 0 && c <= bomb.length - 1) {
					pSum += bomb[r][c];
				}
			}
		}
		return pSum;
	}

	private static int dBomb(int r, int c, int p) {
		int dSum = 0;
		int or = r;
		int oc = c;
		int[] dr = { -1, -1, 1, 1 }; // 좌상 우상 좌하 우하
		int[] dc = { -1, 1, -1, 1 };
		for (int i = 0; i < dr.length; i++) {
			r = or;
			c = oc;
			for (int j = 1; j <= p; j++) {
				r = r + dr[i];
				c = c + dc[i];
				if (r >= 0 && r <= bomb.length - 1 && c >= 0 && c <= bomb.length - 1) {
					dSum += bomb[r][c];
				}
			}
		}
		return dSum;
	}
}