package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2491 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int n = 0; n < N; n++) {
			arr[n] = sc.nextInt();
		}
		int dCnt = 1;
		int max = 1;
		for (int n = 0; n < N - 1; n++) { // 처음에 1을 세고 시작해야 함!!!
			// 작아지는 경우(같은 경우 포함) 카운트
			if (arr[n] >= arr[n + 1]) {
//				System.out.println("작아져요:" + arr[n + 1]);
				dCnt++;
//				System.out.println("dCnt: " + dCnt);
			} else {
//				System.out.println("작아지는 경우 스탑: " + arr[n + 1]);
				dCnt = 1;
//				System.out.println("dCnt: " + dCnt);
			}
			max = (Math.max(max, dCnt));
//			System.out.println("max: " + max);
		}
		int iCnt = 1;
		for (int n = 0; n < N - 1; n++) {
			// 커지는 경우 (같은 경우 포함) 카운트
			if (arr[n] <= arr[n + 1]) {
//				System.out.println("커져요:" + arr[n + 1]);
				iCnt++;
//				System.out.println("iCnt: " + iCnt);
			} else {
//				System.out.println("커지는 경우 스탑: " + arr[n + 1]);
				iCnt = 1;
//				System.out.println("iCnt: " + iCnt);
			}
			max = (Math.max(max, iCnt));
//			System.out.println("max: " + max);
		}
		System.out.println(max);
		sc.close();
	}
}