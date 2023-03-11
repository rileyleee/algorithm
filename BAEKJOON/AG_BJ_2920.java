package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2920 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] mel = new int[8];

		for (int m = 0; m < mel.length; m++) {
			mel[m] = sc.nextInt();
		}
		String result = "ascending";
		for (int m = 0; m < mel.length - 1; m++) {
			if (mel[m] - mel[m + 1] == 1) {
				result = "descending";
			} else if (mel[m] - mel[m + 1] == -1) {
				result = "ascending";
			} else {
				result = "mixed";
				break;
			}
		}
		System.out.println(result);
		sc.close();
	}
}