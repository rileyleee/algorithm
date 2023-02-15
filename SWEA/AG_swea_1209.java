package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {

			int testNum = sc.nextInt();

			// 배열 생성
			int[][] arr = new int[100][100];
			int l = arr.length;

			// 배열 값 입력하기
			for (int r = 0; r < l; r++) {
				for (int c = 0; c < l; c++) {
					arr[r][c] = sc.nextInt();
				}
			}

			// 행의 합 중 최대값 구하기
			// 행의 합을 넣어줄 배열 생성
			int[] rArr = new int[100];
			for (int r = 0; r < l; r++) {
				int rSum = 0;
				for (int c = 0; c < l; c++) {
					rSum += arr[r][c];
				}
				rArr[r] = rSum;
			}

			// 행의 합 배열 중 최대값 구하기
			int rMax = -1;
			for (int i = 0; i < rArr.length; i++) {
				if (rMax < rArr[i])
					rMax = rArr[i];
			}

			// 열의 합 중 최대값 구하기
			// 열의 합을 넣어줄 배열 생성
			int[] cArr = new int[100];
			for (int c = 0; c < l; c++) {
				int cSum = 0;
				for (int r = 0; r < l; r++) {
					cSum += arr[r][c];
				}
				cArr[c] = cSum;
			}

			// 열의 합 배열 중 최대값 구하기
			int cMax = -1;
			for (int i = 0; i < cArr.length; i++) {
				if (cMax < cArr[i])
					cMax = cArr[i];
			}

			// 우하향 대각선의 합 중 최댓값 구하기
			int rdSum = 0;
			for (int i = 0, j = 0; i < 100; i++, j++) {
				rdSum += arr[i][j];
			}

			// 좌하향 대각선의 합 중 최댓값 구하기
			int ldSum = 0;
			for (int i = 0, j = 99; i < 100; i++, j--) {
				ldSum += arr[i][j];
			}

			int[] result = { rMax, cMax, rdSum, ldSum };
			int reMax = 0;
			for (int r : result) {
				if (r > reMax)
					reMax = r;
			}

//		System.out.println(rMax);
//		System.out.println(cMax);
//		System.out.println(rdSum);
//		System.out.println(ldSum);
			System.out.println("#" + testNum + " " + reMax);
		}
		sc.close();
	}
}
