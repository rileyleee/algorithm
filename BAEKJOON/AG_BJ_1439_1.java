package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_1439_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = sc.next().toCharArray();

		int[] iArr = new int[arr.length];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) arr[i];
		}

		int cnt = 0; // 뒤집기 횟수 저장

		for (int i = 0; i < iArr.length - 1; i++) {
			if (iArr[i] != iArr[i + 1]) {
				cnt++;
			}
		}
		if (cnt % 2 == 0) {
			System.out.println(cnt / 2);
		} else {
			System.out.println((cnt + 1) / 2);
		}
		sc.close();
	}
}
