package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_9086 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			String str = sc.next();
			int l = str.length();
			System.out.printf("%c%c\n", str.charAt(0), str.charAt(l - 1));
		}
		sc.close();
	}
}
