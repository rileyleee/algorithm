package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_18511 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] kArr = new int[k];
		for (int a = 0; a < kArr.length; a++) {
			kArr[a] = sc.nextInt();
		}
		recursive(n, kArr);

		sc.close();

	}

	private static int recursive(int n, int[] kArr) {

		char[] strN = String.valueOf(n).toCharArray();
		int diff = 0;
		for (int s = 0; s < strN.length; s++) {
			diff = 0;
			for (int i = 0; i < kArr.length; i++) {
				if (strN[s] - 48 != kArr[i]) {
					diff++;
					System.out.println("diff: " + diff);
					if (diff == kArr.length) {
						break;
					}
				}
			}
		}
		n = n - 1;
		System.out.println("n: " + n);
		if (n <= 0) {
			return -1;
		} else {
			return recursive(n, kArr);
		}
	}
}
