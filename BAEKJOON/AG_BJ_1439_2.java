package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_1439_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int l = str.length();

		char[] sub = new char[l];

		for (int i = 0; i < l; i++) {
			sub[i] = str.charAt(i);
		}

		int cnt = 0;
		for (int i = 0; i < l - 1; i++) {
			if (sub[i] != sub[i + 1]) {
				cnt++;
			}
		}
		System.out.print((sub[0] != sub[l - 1]) ? (cnt + 1) / 2 : cnt / 2);
	}
}
