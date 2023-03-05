package algorithm.SWEA;

import java.util.Scanner;

public class AG_알고주간평가_마법사장난_2 { // 정동교님 코드

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int[][] map = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					map[r][c] = sc.nextInt();
				}
			}

			int S = sc.nextInt(); // 마법 횟수 줄수

			// 행 열 범위 종류
			// 0백마법 가로세로 1흑마법 X 범위 2둘다
			for (int s = 0; s < S; s++) {
				int R = sc.nextInt();
				int C = sc.nextInt();
				int range = sc.nextInt();
				int type = sc.nextInt();

				if (type == 0) {
					map[R][C] = map[R][C] * 2;
					if (map[R][C] == 0)
						map[R][C] = 1;
					for (int k = 1; k <= range; k++) {
						if (R - k >= 0) {
							map[R - k][C] = map[R - k][C] * 2;
							if (map[R - k][C] == 0)
								map[R - k][C] = 1;
						}
						if (R + k < N) {
							map[R + k][C] = map[R + k][C] * 2;
							if (map[R + k][C] == 0)
								map[R + k][C] = 1;
						}
						if (C - k >= 0) {
							map[R][C - k] = map[R][C - k] * 2;
							if (map[R][C - k] == 0)
								map[R][C - k] = 1;
						}
						if (C + k < N) {
							map[R][C + k] = map[R][C + k] * 2;
							if (map[R][C + k] == 0)
								map[R][C + k] = 1;
						}
					}
				}

				else if (type == 1) {
					map[R][C] = map[R][C] / 2;
					for (int k = 1; k <= range; k++) {
						if (R - k >= 0 && C - k >= 0)
							map[R - k][C - k] = map[R - k][C - k] / 2;
						if (R + k < N && C + k < N)
							map[R + k][C + k] = map[R + k][C + k] / 2;
						if (C - k >= 0 && R + k < N)
							map[R + k][C - k] = map[R + k][C - k] / 2;
						if (C + k < N && R - k >= 0)
							map[R - k][C + k] = map[R - k][C + k] / 2;
					}
				} else if (type == 2) {
					for (int k = 1; k <= range; k++) {
						if (R - k >= 0) {
							map[R - k][C] = map[R - k][C] * 2;
							if (map[R - k][C] == 0)
								map[R - k][C] = 1;
						}
						if (R + k < N) {
							map[R + k][C] = map[R + k][C] * 2;
							if (map[R + k][C] == 0)
								map[R + k][C] = 1;
						}
						if (C - k >= 0) {
							map[R][C - k] = map[R][C - k] * 2;
							if (map[R][C - k] == 0)
								map[R][C - k] = 1;
						}
						if (C + k < N) {
							map[R][C + k] = map[R][C + k] * 2;
							if (map[R][C + k] == 0)
								map[R][C + k] = 1;
						}
						if (R - k >= 0 && C - k >= 0)
							map[R - k][C - k] = map[R - k][C - k] / 2;
						if (R + k < N && C + k < N)
							map[R + k][C + k] = map[R + k][C + k] / 2;
						if (C - k >= 0 && R + k < N)
							map[R + k][C - k] = map[R + k][C - k] / 2;
						if (C + k < N && R - k >= 0)
							map[R - k][C + k] = map[R - k][C + k] / 2;
					}
				}
			}

			int sum = 0;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					sum += map[r][c];
				}
			}
			System.out.printf("#%d %d\n", tc, sum);
		}
	}
}
