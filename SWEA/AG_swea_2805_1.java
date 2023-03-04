package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2805_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int N = sc.nextInt();
			int[][] agri = new int[N][N];
			int sum = 0;
			for (int r = 0; r < N; r++) {
				String str = sc.next();
				for (int c = 0; c < N; c++) {
					agri[r][c] = str.charAt(c) - 48;
					if (Math.abs(N / 2 - r) + Math.abs(N / 2 - c) <= N / 2) {
						sum += agri[r][c];
					}
				}
			}
			System.out.println("#" + t + " " + sum);
		}
		sc.close();
	}
}