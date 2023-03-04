package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4613_1 {
	public static void main(String[] args) { // 깃발은 W -> B -> R순 //맨 윗줄은 w 맨 아랫줄은 반드시 R이어야 함
		// 각 행별로 각 색의 수 비교
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			// 원래 배열 받기
			char[][] oArr = new char[n][m];

			for (int r = 0; r < n; r++) {
				String str = sc.next();
				for (int c = 0; c < m; c++) {
					oArr[r][c] = str.charAt(c);
				}
			}
			// 행별 색 분포
			int[] wArr = new int[n];
			int[] bArr = new int[n];
			int[] rArr = new int[n];

			for (int r = 0; r < n; r++) {
				for (int c = 0; c < m; c++) {
					if (oArr[r][c] == 'W') {
						wArr[r]++;
					} else if (oArr[r][c] == 'B') {
						bArr[r]++;
					} else if (oArr[r][c] == 'R') {
						rArr[r]++;
					}
				}
			}

			char[] flag = new char[n];// 국기의 행별 색 저장 배열
			flag[0] = 'W'; // 맨 윗줄은 흰색
			flag[n - 1] = 'R'; // 맨 아랫줄은 빨간색

			int firstline = m - wArr[0]; // 맨 윗줄 카운트(무조건 흰색이어야 함)
			int lastline = m - rArr[n - 1]; // 맨 아랫줄 카운트(무조건 빨간색이어야 함)

			int changeSum = 0;
			int min = Integer.MAX_VALUE;

			for (int i = 1; i < n - 1; i++) { 
				for (int j = i; j < n - 1; j++) { 
					changeSum = 0;
					System.out.println(i + "," + j);
					for (int f = 1; f < n - 1; f++) { 
						if (f < i) {
							flag[f] = 'W';
							changeSum += m - wArr[f];
						} else if (f >= i && f <= j) { 
							flag[f] = 'B';
							changeSum += m - bArr[f];
						} else if (f > j) { 
							flag[f] = 'R';
							changeSum += m - rArr[f];
						}
					}
					System.out.println(Arrays.toString(flag));
					min = Math.min(min, firstline + lastline + changeSum);
				}
			}
			System.out.println("#" + t + " " + min);
		}
		sc.close();
	}
}