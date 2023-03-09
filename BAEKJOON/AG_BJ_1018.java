package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_1018 { 체스판 다시 칠하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int max_nm = Math.max(n, m);

		int[][] chess = new int[n][m + 1];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') { // W는 0, B는 1
					chess[i][j] = 0;
				} else {
					chess[i][j] = 1;
				}
			}
		}
		System.out.println("초기값");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}

		int r = 0;
		int c = 0;
		int cnt = 0;
		int minimum = Integer.MAX_VALUE;
		int lastCnt = 0;
		// 8*8 체스판 경우의 수 -> 좌상 우하 좌표 지정 //열 먼저 순회해야 하지 않나 싶다
		for (int t = 0; t <= max_nm - 8; t++) {// 왼쪽 상단부터 8*8을 유지할 수 있는 범위 까지 늘려본다.
			lastCnt = cnt;
			cnt = 0;
			System.out.println("t값:" + t );
			outer: for (r = t; r < 8 + t; r++) { // 행 이동
				for (c = 0; c < 8; c++) {
					// 경계값 조건
					if (r >= 0 && r < n && c >= 0 && c < m) {
						System.out.println(r + "," + c);
						if (c < m - 1) {
							if (chess[r][c] == chess[r][c + 1]) {
								System.out.println(r + "," + c);
								chess[r][c + 1] = 1 - chess[r][c + 1]; // 값을 바꿔주고
								cnt++;
								System.out.println(cnt);
							}
						}
					} else {
						System.out.println("cnt0으로 바뀐다고?" + cnt);
						cnt = lastCnt;
						break outer;

					}
				}
			}

			System.out.println("변경 후");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(chess[i][j]);
				}
				System.out.println();
			}
			System.out.println(cnt);
			minimum = Math.min(minimum, cnt);
		}
		System.out.println("minimum:" + minimum);
		sc.close();
	}
}
