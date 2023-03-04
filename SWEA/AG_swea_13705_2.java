package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13705_2 {
	public static void main(String[] args) { // 배열순회로 풀어보기 네모네모네모 확장시켜가면서 GOOD
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int pw = sc.nextInt();
			int tmpPw = pw;

			int r = sc.nextInt();
			int c = sc.nextInt();
			int change = sc.nextInt();

			int[][] wave = new int[n + 1][n + 1];
			wave[r][c] = pw;

////------------------------------------- 배열 출력-----------------------------------------//
//			for (int a = 1; a <= n; a++) {
//				for (int b = 1; b <= n; b++) {
//					System.out.print(wave[a][b] + " ");
//				}
//				System.out.println();
//			}
////------------------------------------- 배열 출력-----------------------------------------//
			int tmpR1 = r;
			int tmpC1 = c;
			int tmpR2 = r;
			int tmpC2 = c;
			boolean more = true;

			outer: while (true) {
				tmpPw += change;
				tmpR1--;
				tmpC1--;
				tmpR2++;
				tmpC2++;
//				System.out.printf("임시 강도 %d 좌상 행 %d 좌상 열 %d 우하 행 %d 우하 열 %d \n", tmpPw, tmpR1, tmpC1, tmpR2, tmpC2);
				more = false;
				for (int nr = tmpR1; nr <= tmpR2; nr++) { // 확장 시킨 범위 행
					for (int nc = tmpC1; nc <= tmpC2; nc++) { // 확장 시킨 범위 열
						if (nr > 0 && nr <= n && nc > 0 && nc <= n) { // 경계가 아니고
							if (wave[nr][nc] == 0) { // 아직 비어 있을 때
								wave[nr][nc] = tmpPw;
								more = true;
							}
							if (wave[nr][nc] < 0) {// 증감폭 제한(위에서 저장한 값 덮어쓰기)
								wave[nr][nc] = 0;
							}
							if (wave[nr][nc] > 255) {
								wave[nr][nc] = 255;
							}
////------------------------------------- 배열 출력-----------------------------------------//
//							System.out.println("좌표: " + nr + "," + nc);
//							for (int a = 1; a <= n; a++) {
//								for (int b = 1; b <= n; b++) {
//									System.out.print(wave[a][b] + "     ");
//								}
//								System.out.println();
//							}
//							System.out.println();
////------------------------------------- 배열 출력-----------------------------------------//
						}
					}
				}
				if (!more) {
					break outer;
				}
				if (tmpPw < 0) {
					break outer;
				}
			}
			System.out.print("#" + t);
			wave[r][c] = pw;
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum = 0;
				for (int j = 1; j <= n; j++) {
					sum += wave[i][j];
				}
				System.out.print(" " + sum);
			}
			System.out.println();
		}
		sc.close();
	}
}