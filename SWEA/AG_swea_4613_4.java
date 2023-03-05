package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4613_4 { // 20분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			char[][] flag = new char[n][m];
			String str = "";
			for (int r = 0; r < n; r++) {
				str = sc.next();
				for (int c = 0; c < m; c++) {
					flag[r][c] = str.charAt(c);
				}
			}
			int cnt = 0;
			int min = Integer.MAX_VALUE;

			char[] arr = new char[n];
			// 한 줄을 남겨 놓지 않으면'W'나 'R'중 빠지는 값이 생김 따라서 시작이 1
			for (int i = 1; i < n - 1; i++) { // 3개의 구간으로 나뉘어야 하는데 그럼 두개의 경계가 필요함
				for (int j = i + 1; j < n; j++) { // 그 각각이 i와 j임
					cnt = 0;
					for (int r = 0; r < i; r++) { // 1구간
						for (int c = 0; c < m; c++) {
							if (flag[r][c] != 'W') {
								cnt++;
							}
							arr[r] = 'W';
						}
					}
					for (int r = i; r < j; r++) { // 2구간
						for (int c = 0; c < m; c++) {
							if (flag[r][c] != 'B') {
								cnt++;
							}
							arr[r] = 'B';
						}
					}
					for (int r = j; r < n; r++) { // 3구간
						for (int c = 0; c < m; c++) {
							if (flag[r][c] != 'R') {
								cnt++;
							}
							arr[r] = 'R';
						}
					}
					min = Math.min(min, cnt);
					// System.out.println(Arrays.toString(arr));
					// System.out.println(min);
				}
			}
			System.out.println("#" + t + " " + min);
		}
		sc.close();
	}
}
