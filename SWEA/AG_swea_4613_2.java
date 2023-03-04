package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_4613_2 { // 정동교님 코드

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			char[][] map = new char[N][M];
			char[][] flag = new char[N][M];

			int min = 2500;

			for (int r = 0; r < N; r++) {
				String str = sc.next();
				for (int c = 0; c < M; c++) {
					map[r][c] = str.charAt(c);
				}
			}

			for (int i = 1; i < N - 1; i++) {
				int t1 = i;
				for (int j = i + 1; j < N; j++) {
					int t2 = j;
					for (int r = 0; r < t1; r++) {
						for (int c = 0; c < M; c++) {
							flag[r][c] = 'W';
						}
					}
					for (int r = t1; r < t2; r++) {
						for (int c = 0; c < M; c++) {
							flag[r][c] = 'B';
						}
					}
					for (int r = t2; r < N; r++) {
						for (int c = 0; c < M; c++) {
							flag[r][c] = 'R';
						}
					}

					int cnt = 0;
					for (int r = 0; r < N; r++) {
						for (int c = 0; c < M; c++) {
							if (map[r][c] != flag[r][c]) {
								cnt++;
							}
						}
					}
					if (cnt < min) {
						min = cnt;
					}
				}

			}

			System.out.printf("#%d %d\n", tc, min);
		}
	}
}
