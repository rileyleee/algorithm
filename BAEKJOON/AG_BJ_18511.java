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

		kArr = new int[k];
		for (int a = 0; a < kArr.length; a++) {
			kArr[a] = sc.nextInt();
		}

		for (int l = length; l > 0; l--) {
			nNum = new int[l];
			rec(0, l);
			if (max != 0) {
				System.out.println(max);
				break;
			}
		}

		sc.close();

	}

	private static int rec(int i, int l) {
		// 기저조건
		if (i == l) {
			sb = new StringBuilder();

			for (int s = 0; s < l; s++) {
				sb.append(nNum[s]);
			}
			// System.out.println("문자열: " + sb.toString());
			int num = Integer.parseInt(sb.toString());
			// System.out.println("num: " + num);
			if (num <= n && num > max) {
				max = num;
			}
		}

		// 재귀조건
		else {
			for (int j = 0; j < kArr.length; j++) {
				nNum[i] = kArr[j];
				// System.out.println(Arrays.toString(nNum));
				rec(i + 1, l);
				nNum[i] = 0;
				// System.out.println(Arrays.toString(nNum));
			}
		}
		return max;
	}
}