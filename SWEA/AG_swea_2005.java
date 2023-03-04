package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2005 { //35분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();
			System.out.println("#" + t);
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == 0 || i == j || j == 0) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}