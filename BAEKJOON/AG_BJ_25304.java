package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int kind = sc.nextInt();

		for (int a = 0; a < kind; a++) {
			total -= sc.nextInt() * sc.nextInt();
		}

		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
