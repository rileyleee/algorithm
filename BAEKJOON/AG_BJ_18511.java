package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_18511 {
	static StringBuilder sb;
	static int[] kArr;
	static int[] nNum;
	static int max = 0;
	static int n = 0;
	static int length;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		length = String.valueOf(n).length();
		int k = sc.nextInt();

		kArr = new int[k]; // 같거나 작으니까 배열 길이 고정 가능
		for (int a = 0; a < kArr.length; a++) {
			kArr[a] = sc.nextInt();
		}
		nNum = new int[length];
		rec(0);
		System.out.println(max);

		sc.close();

	}

	private static int rec(int i) {
		// 기저조건
		if (i == length) {
			sb = new StringBuilder();

			for (int s = 0; s < length; s++) {
				sb.append(nNum[s]);
			}
			System.out.println("문자열: " + sb.toString());
			int num = Integer.parseInt(sb.toString());
			System.out.println("num: " + num);
			if (num <= n && num > max) {
				max = num;
			}
		}

		// 재귀조건
		else {
			for (int j = 0; j < kArr.length; j++) {
				nNum[i] = kArr[j];
				System.out.println(Arrays.toString(nNum));
				rec(i + 1);
				nNum[i] = 0;
				System.out.println(Arrays.toString(nNum));
			}
		}
		return max;
	}
}