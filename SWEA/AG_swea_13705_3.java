package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13705_3 { // 15분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt() + 1;
			int pw = sc.nextInt();
			int row = sc.nextInt();
			int col = sc.nextInt();
			int chg = sc.nextInt();

			int[][] wave = new int[n][n];
			wave[row][col] = pw;

			// w로 인해 r값이 경계를 벗어난다고 하더라도 if문에서 걸리지 않기 때문에 괜찮다
			for (int w = 1; w < n; w++) { // 파동 시작점부터 시작해서 하나씩 늘려나간다. 테두리에 시작점이 위치할 경우를 고려해 최대 크기는 n-1
				for (int r = row - w; r <= row + w; r++) { // 행의 너비와
					for (int c = col - w; c <= col + w; c++) { // 열의 높이를 -> 그러면 점점 네모가 커진다.
						if (r >= 1 && r < n && c >= 1 && c < n) {
							if (wave[r][c] == 0) {
								wave[r][c] = pw + chg * w;
							}
							if (wave[r][c] < 0) {
								wave[r][c] = 0;
							} else if (wave[r][c] > 255) {
								wave[r][c] = 255;
							}
						}
					}
				}
			}
			// 시작점에 다시 원래 값 넣기
			wave[row][col] = pw;

			int sum = 0;
			System.out.print("#" + t);
			for (int i = 1; i < n; i++) {
				sum = 0;
				for (int j = 1; j < n; j++) {
					sum += wave[i][j];
				}
				System.out.print(" " + sum);
			}
			System.out.println();
		}
		sc.close();
	}
}