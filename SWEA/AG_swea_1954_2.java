package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1954_2 {
	public static void main(String[] args) { //정동교님 코드

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int R = sc.nextInt();
			int[][] arr = new int[R][R];

			int cnt = 1;

			for (int j = 0; j < R; j++) { // 오
				arr[0][j] = cnt++;
			}
			for (int K = R - 1, m = 0; K > 0; K--, m++) { // K

				for (int j = 1; j < K + 1; j++) { // 아래
					arr[j + m][R - 1 - m] = cnt++;
				}
				for (int j = 1; j < K; j++) { // 왼
					arr[R - 1 - m][R - 1 - j - m] = cnt++;
				}

				K = K - 1;

				for (int j = 0; j < K; j++) { // 위
					arr[R - 1 - j - m][0 + m] = cnt++;
				}

				for (int j = 0; j < K + 1; j++) { // 오
					arr[1 + m][j + m] = cnt++;
				}

			}

			System.out.println("#" + (i + 1));
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < R; c++) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println();
			}
		}
	}
}
