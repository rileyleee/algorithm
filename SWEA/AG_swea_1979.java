package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			int[][] puzzle = new int[N][N];

			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					puzzle[r][c] = sc.nextInt();
				}
			}
			int rCnt = 0;
			int cCnt = 0;
			int possible = 0;

			// 행 확인
			for (int r = 0; r < N; r++) {
				rCnt = 0;
				for (int c = 0; c < N; c++) {
//					System.out.println(r + "," + c);
					if (puzzle[r][c] == 1) {
						rCnt += puzzle[r][c];
					} else {
						rCnt = 0;
					}
//					System.out.println("rCnt: " + rCnt);
					if (rCnt == K) {
						possible++;
//						System.out.println("possible: " + possible);
					} else if (rCnt > K) {
						possible--;
//						System.out.println("possible: " + possible);
						rCnt = 0;
//						System.out.println("rCnt 초기화: " + rCnt);
					}
				}
			}
			// 열 확인
			for (int c = 0; c < N; c++) {
				cCnt = 0;
				for (int r = 0; r < N; r++) {
//					System.out.println(r + "," + c);
					if (puzzle[r][c] == 1) {
						cCnt += puzzle[r][c];
					} else {
						cCnt = 0;
					}

//					System.out.println("cCnt: " + cCnt);
					if (cCnt == K) {
						possible++;
//						System.out.println("possible: " + possible);
					} else if (cCnt > K) {
						possible--;
//						System.out.println("possible: " + possible);
						cCnt = 0;
//						System.out.println("cCnt 초기화: " + cCnt);
					}
				}
			}
			System.out.println("#" + t + " " + possible);
		}
		sc.close();
	}
}
