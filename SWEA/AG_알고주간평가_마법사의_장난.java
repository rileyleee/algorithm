package algorithm.SWEA;

import java.util.Scanner;

public class AG_알고주간평가_마법사의_장난 { // 1시간 10분 소요
	public static int arr[][];
	public static int r;
	public static int c;
	public static int range;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int mNum = sc.nextInt();

			for (int m = 1; m <= mNum; m++) { // 변수명 제대로 보기 멍청아
				r = sc.nextInt();
				c = sc.nextInt();
				range = sc.nextInt();
				int mType = sc.nextInt();

				switch (mType) {
				case 2: // 잿빛
					int original = arr[r][c];
					whiteMagic(arr, r, c, range);
					blackMagic(arr, r, c, range);
					// 주어진 위치는 그대로 두도록 코드 추가
					arr[r][c] = original;
					break;
				case 1: // 흑
					blackMagic(arr, r, c, range);
					break;
				case 0: // 백
					whiteMagic(arr, r, c, range);
					break;
				}				

//				if (mType == 2) {  //if문도 가능
//					// 잿빛
//					int original = arr[r][c];
//					whiteMagic(arr, r, c, range);
//					blackMagic(arr, r, c, range);
//					// 주어진 위치는 그대로 두도록 코드 추가
//					arr[r][c] = original;
//
//				} else if (mType == 1) {
//					blackMagic(arr, r, c, range);
//
//				} else if (mType == 0) {
//					whiteMagic(arr, r, c, range);
//				}
			}
//			// 배열 값 확인
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum += arr[i][j];
				}
			}
			System.out.println("#" + t + " " + sum);
		}
		sc.close();
	}

	public static int[][] whiteMagic(int[][] arr, int r, int c, int range) { // 백마법 -> 십자 모양 두배 증가 단, 0의 경우 1로 생성
		int[][] drc = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // 상하좌우
		if (arr[r][c] == 0) { // 기준 좌표가 0이면 1로 생성해주고
			arr[r][c] = 1;
		} else { // 아니면 2배로 에너지 증가
			arr[r][c] = 2 * arr[r][c];
		}
		for (int rg = 1; rg <= range; rg++) {
			for (int i = 0; i < drc.length; i++) {
				int tempR = r;
				int tempC = c;
				tempR = r + drc[i][0] * rg;
				tempC = c + drc[i][1] * rg;
				if (tempR >= 0 && tempC >= 0 && tempR < arr.length && tempC < arr.length) {
					if (arr[tempR][tempC] == 0) { // 해당 좌표가 0이면 1로 생성해주고
						arr[tempR][tempC] = 1;
					} else { // 아니면 2배로 에너지 증가
						arr[tempR][tempC] = 2 * arr[tempR][tempC];
					}
				}
			}
		}
		return arr;
	}

	public static int[][] blackMagic(int[][] arr, int r, int c, int range) { // 흑마법 -> 대각선 모양 절반 감소
		int[][] drc = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } }; // 좌상 우상 좌하 우하
		arr[r][c] = arr[r][c] / 2; // 기준 좌표 절반으로 줄여주고
		for (int rg = 1; rg <= range; rg++) { // 범위만큼 반복
			for (int i = 0; i < drc.length; i++) {
				int tempR = r;
				int tempC = c;
				tempR = r + drc[i][0] * rg;
				tempC = c + drc[i][1] * rg;
				if (tempR >= 0 && tempC >= 0 && tempR < arr.length && tempC < arr.length) { // 해당 좌표 절반으로 줄여주기
					arr[tempR][tempC] = arr[tempR][tempC] / 2;
				}
			}
		}
		return arr;
	}
}
