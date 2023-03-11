package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] cnt = new int[10];

		for (int i = 0; i < String.valueOf(a * b * c).length(); i++) {
			cnt[String.valueOf(a * b * c).charAt(i) - 48]++;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();
	}
}