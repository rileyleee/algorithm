package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13705 {
	public static void main(String[] args) { // 배열 풀 때는 거리를 고려하자.
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			System.out.print("#" + t);

			int N = sc.nextInt();
			int start = sc.nextInt();
			int r = sc.nextInt() - 1; // 배열이 1부터 시작하는데 편의상 위치 맞추기 위해 -1
			int c = sc.nextInt() - 1;
			int change = sc.nextInt();

			int[][] wave = new int[N][N];
			wave[r][c] = start;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) { // 각 좌표와 시작점의 행과 열 값을 비교해서 그 차이가 큰 값과 변화값을 곱해 더해준다.
					// 더 먼거리가 되는 행 또는 열이 기준이 되는 것
					int diff = Math.max(Math.abs(r - i), Math.abs(c - j));
					wave[i][j] = start + change * diff;
					if (wave[i][j] < 0) {
						wave[i][j] = 0;
					}
					if (wave[i][j] > 255) {
						wave[i][j] = 255;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				int rSum = 0;
				for (int j = 0; j < N; j++) {
					rSum += (wave[i][j]);
				}
				System.out.print(" " + rSum);
			}
			System.out.println();
		}
		sc.close();
	}
}