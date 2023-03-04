package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_10157 { // 1시간 5분 소요 경계값 분석 k=1일때 ..
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int r = sc.nextInt();

		int[][] seats = new int[r + 1][c + 1];

		int k = sc.nextInt();

		// 예시 시작점이 (6,1) 진행방향은 상우좌하

		int[][] drc = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };

		int i = r;
		int j = 1;
		int waiting = 0;
		seats[i][j] = ++waiting;
		boolean noSeats = true;
		outer: while (k <= r * c && waiting < r * c) {
			noSeats = false;
			if (k == 1) {
				System.out.println(j + " " + (r - i + 1));
				break;
			}

			// 상
			i = i + drc[0][0];
			j = j + drc[0][1];
			while (true) {
//				System.out.println(i + "," + j);
				if (i > 0 && seats[i][j] == 0) {
					seats[i][j] = ++waiting;
					if (waiting == k) {
						System.out.print(j + " " + (r - i + 1));

					}
					i = i + drc[0][0];
					j = j + drc[0][1];
				} else {
//					System.out.println("되돌리기 " + i + "," + j);
					i = i - drc[0][0];
					j = j - drc[0][1];
					break;
				}
			}

			// 우
			i = i + drc[1][0];
			j = j + drc[1][1];
			while (true) {
//				System.out.println(i + "," + j);
				if (j <= c && seats[i][j] == 0) {
					seats[i][j] = ++waiting;
					if (waiting == k) {
						System.out.print(j + " " + (r - i + 1));
						break outer;
					}
					i = i + drc[1][0];
					j = j + drc[1][1];
				} else {
//					System.out.println("되돌리기 " + i + "," + j);
					i = i - drc[1][0];
					j = j - drc[1][1];
					break;
				}
			}

			// 좌
			i = i + drc[2][0];
			j = j + drc[2][1];
			while (true) {
//				System.out.println(i + "," + j);
				if (j > 0 && seats[i][j] == 0) {
					seats[i][j] = ++waiting;
					if (waiting == k) {
						System.out.print(j + " " + (r - i + 1));
						break outer;
					}
					i = i + drc[2][0];
					j = j + drc[2][1];
				} else {
//					System.out.println("되돌리기 " + i + "," + j);
					i = i - drc[2][0];
					j = j - drc[2][1];
					break;
				}
			}

			// 하
			i = i + drc[3][0];
			j = j + drc[3][1];
			while (true) {
//				System.out.println(i + "," + j);
				if (i <= r && seats[i][j] == 0) {
					seats[i][j] = ++waiting;
					if (waiting == k) {
						System.out.print(j + " " + (r - i + 1));
						break outer;
					}
					i = i + drc[3][0];
					j = j + drc[3][1];
				} else {
//					System.out.println("되돌리기 " + i + "," + j);
					i = i - drc[3][0];
					j = j - drc[3][1];
					break;
				}
			}
		}
		if (noSeats)
			System.out.println(0);

//		for (int l = 0; l < r + 1; l++) {
//			for (int m = 0; m < c + 1; m++) {
//				System.out.print(seats[l][m] + "  ");
//			}
//			System.out.println();
//		}
		sc.close();
	}
}