package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			StringBuilder sb = new StringBuilder();
			int n = sc.nextInt();
			char[][] tel = new char[n + 6][n + 6];
			for (int r = 0; r < n; r++) {
				String str = sc.next();
				for (int c = 0; c < n; c++) {
					tel[r + 3][c + 3] = str.charAt(c);
				}
			}
			int[] dr = { -1, 1, 0, 0 };// 상하좌우 행
			int[] dc = { 0, 0, -1, 1 }; // 상하좌우 열

//--------------------순회하면서 송전탑 있으면 X로 바꾸기-------------------------//

			for (int r = 0; r < n + 6; r++) { // switch로 바꿔보기
				for (int c = 0; c < n + 6; c++) {
					if (tel[r][c] == 'A') { // 1길이
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
						}

					} else if (tel[r][c] == 'B') { // 2길이
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
							tel[r + dr[i] * 2][c + dc[i] * 2] = 'X';
						}
					} else if (tel[r][c] == 'C') { // 3길이
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
							tel[r + dr[i] * 2][c + dc[i] * 2] = 'X';
							tel[r + dr[i] * 3][c + dc[i] * 3] = 'X';
						}
					}
				}
			}
			int hCnt = 0;
			for (int r = 0; r < n + 6; r++) {
				for (int c = 0; c < n + 6; c++) {
					if (tel[r][c] == 'H') {
						hCnt++;
					}
				}
			}
			sb.append("#").append(t).append(" ").append(hCnt);
			System.out.println(sb.toString());
		}
		sc.close();
	}
}