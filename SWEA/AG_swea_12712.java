package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AG_swea_12712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());

		for (int t = 0; t < test; t++) {

			String str = br.readLine();//n m

			StringTokenizer st = new StringTokenizer(str);

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			int[][] flies = new int[3 * n][3 * n];

			// 경계를 벗어나지 않도록 넓게 그리기
			for (int r = n; r < 2 * n; r++) {
				String str2 = br.readLine();
				st = new StringTokenizer(str2);
				for (int c = n; c < 2 * n; c++) {
					flies[r][c] = Integer.parseInt(st.nextToken());
				}
			}

//			// -------------------------------------------//
//			// 배열 확인하기
//			for (int r = 0; r < 3 * n; r++) {
//				for (int c = 0; c < 3 * n; c++) {
//					System.out.print(flies[r][c] + "  ");
//				}
//				System.out.println();
//			}
//			// -------------------------------------------//

			int maxKill = Integer.MIN_VALUE;

			for (int r = n; r < 2 * n; r++) {
				for (int c = n; c < 2 * n; c++) {
					int p = 1;
					int d = 1;
					int pSum = 0;
					int dSum = 0;

					// 십자 모양 파리 퇴치
					pSum += flies[r][c]; // 본인
					while (p < m) {
						pSum += flies[r - p][c]; // 상
						pSum += flies[r + p][c]; // 하
						pSum += flies[r][c - p]; // 좌
						pSum += flies[r][c + p]; // 우
						p++;
					}
//				System.out.println(r + "," + c);
				System.out.println("pSum: " + pSum);

					// 대각선 모양 파리 퇴치
					dSum += flies[r][c]; // 본인
					while (d < m) {
						dSum += flies[r - d][c + d]; // 우상
						dSum += flies[r - d][c - d]; // 좌상
						dSum += flies[r + d][c + d]; // 우하
						dSum += flies[r + d][c - d]; // 좌하
						d++;
					}
//				System.out.println(r + "," + c);
				System.out.println("dSum: " + dSum);

					if (pSum >= dSum) {
						if (pSum >= maxKill) {
							maxKill = pSum;
						}
					} else if (dSum >= pSum) {
						if (dSum >= maxKill) {
							maxKill = dSum;
						}
					}
				System.out.println("temp_maxKill: " + maxKill);
				}
			}
//		System.out.println(maxKill);
			System.out.println("#" + (t + 1) + " " + maxKill);
		}
	}
}
