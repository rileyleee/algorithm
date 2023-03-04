package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13707_1 {
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
			int[] dc = { 0, 0, -1, 1 }; //ㄴ 상하좌우 열

			for (int r = 0; r < n + 6; r++) { //CBA 순으로 작성하고 break를 하지 않으면 된다...
				for (int c = 0; c < n + 6; c++) {
					switch (tel[r][c]) {
					case 'A':
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
						}
						break;
					case 'B':
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
							tel[r + dr[i] * 2][c + dc[i] * 2] = 'X';
						}
						break;
					case 'C':
						for (int i = 0; i < dr.length; i++) {
							tel[r + dr[i]][c + dc[i]] = 'X';
							tel[r + dr[i] * 2][c + dc[i] * 2] = 'X';
							tel[r + dr[i] * 3][c + dc[i] * 3] = 'X';
						}
						break;
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