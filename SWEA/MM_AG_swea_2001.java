package SWEA;

import java.util.Scanner;

public class MM_AG_swea_2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			// 배열 만들기
			int[][] space = new int[n][n];
			// 배열 채우기
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					space[j][k] = sc.nextInt();
				}
			}

			// 파리채 면적 값 모두 더하기
			int maxflies = 0;

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					int flies = 0;
					for (int l = 0; l < m; l++) {
						for (int o = 0; o < m; o++) {
							if (j + l > (n - 1) || j + l < 0 || k + o > (n - 1) || k + o < 0)
								continue;
							else {
								flies += space[j + l][k + o];
							}
						}
						if (maxflies < flies) {
							maxflies = flies;
						}
					}
				}
			}
			System.out.println("#" + (i + 1) + " " + maxflies);
		}
		sc.close();
	}
}
//파리채 크기 줄여서 가능
//배열 한 번 더 안 돌아도 가능

//// 배열 확인 코드
//for (int j = 0; j < (n + 2); j++) {
//	for (int k = 0; k < (n + 2); k++) {
//		System.out.printf("%3d", space[j][k]);
//	}
//	System.out.println("");
//}

////파리채 면적 확인 코드
//System.out.print((j + l) + "," + (k + o));
//System.out.print(" "+space[j + l][k + o]);
//System.out.println();