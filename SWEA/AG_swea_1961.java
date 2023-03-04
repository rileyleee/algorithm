package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1961 { // 30분 소요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {
			int n = sc.nextInt();

			int[][] arr = new int[n][n];

			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					arr[r][c] = sc.nextInt();
				}
			}

			System.out.println("#" + t);
			// 아래의 포문을 n번 만큼 돌기
			for (int total = 0; total < n; total++) {
				// 90도 회전 -> 열 우선순회 행 역방향 열 정방향
				for (int i = 0; i < n; i++) {
					System.out.print(arr[n - i - 1][total]);
				}
				System.out.print(" ");
				// 180도 회전 -> 행 우선순회 행 역방향 열 역방향
				for (int j = 0; j < n; j++) {
					System.out.print(arr[n - total - 1][n - j - 1]);
				}
				System.out.print(" ");
				// 270도 회전 -> 열 우선순회 행 정방향 열 정방향
				for (int k = 0; k < n; k++) {
					System.out.print(arr[k][n - total - 1]);
				}
				System.out.print("\n");
			}
		}
		sc.close();
	}
}