package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_11047 {
	public static void main(String[] args) { //30분 소요
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] mArr = new int[n];

		for (int m = 0; m < mArr.length; m++) {
			mArr[m] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		int eachCnt = 0;
		int money = 0;

		while (true) {
			min = Integer.MAX_VALUE;
			eachCnt = 0;
			// 현재 금액과 가장 가까운 동전 종류 찾기
			for (int m = 0; m < mArr.length; m++) {
				if (k - mArr[m] >= 0 && k - mArr[m] < min) {
					money = mArr[m];
				}
			}

			eachCnt = k / money; // 해당 동전의 개수 카운팅하기
			cnt += eachCnt;

			k = k - money * eachCnt; // 남은 돈 갱신하기

			if (k == 0) {
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}