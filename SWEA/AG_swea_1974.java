package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {
			// 스도쿠 배열 선언
			int[][] sdoku = new int[9][9];
			// 스도쿠 배열 입력
			for (int i = 0; i < sdoku.length; i++) {
				for (int j = 0; j < sdoku[0].length; j++) {
					sdoku[i][j] = sc.nextInt();
				}
			}
			int flag = 1;

			// 행 비교
			for (int i = 0; i < sdoku.length; i++) {
				// 카운팅 배열 생성
				int[] cnt = new int[9];
				for (int j = 0; j < sdoku[0].length; j++) {
					cnt[sdoku[i][j] - 1] += 1;
				}
				for (int k = 0; k < cnt.length; k++) {
					if (cnt[k] == 0) {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				// 열 비교
				for (int i = 0; i < sdoku.length; i++) {
					// 카운팅 배열 생성
					int[] cnt = new int[9];
					for (int j = 0; j < sdoku[0].length; j++) {
						cnt[sdoku[j][i] - 1] += 1;
					}
					for (int k = 0; k < cnt.length; k++) {
						if (cnt[k] == 0) {
							flag = 0;
							break;
						}
					}
				}
			}
			if (flag == 1) {
				// 각 정사각형의 시작 좌표
				int[] startRow = { 0, 3, 6 };
				int[] startCol = { 0, 3, 6 };
				// 각 정사각형의 (0,0)와 좌표 8개 이동
				int[] deltaRow = { 0, 0, 0, 1, 1, 1, 2, 2, 2 };
				int[] deltaCol = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };

				for (int row = 0; row < startRow.length; row++) {
					for (int col = 0; col < startCol.length; col++) {
						// 카운팅 배열 생성
						int[] cnt = new int[9];
						for (int move = 0; move < 9; move++) {
							int nRow = 0 + deltaRow[move];
							int nCol = 0 + deltaCol[move];
							cnt[sdoku[nRow][nCol] - 1] += 1;
						}
						for (int k = 0; k < cnt.length; k++) {
							if (cnt[k] == 0) {
								flag = 0;
								break;
							}
						}
					}
				}
			}
			System.out.println("#" + (test + 1) + " " + flag);
		}
		sc.close();
	}
}
