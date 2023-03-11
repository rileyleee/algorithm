package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();

		h = h + c / 60;
		m = m + c % 60;

		if (m > 59) {
			m = m % 60;
			h++;
		}

		if (h > 23) {
			h = h % 24;
		}
		System.out.println(h + " " + m);
		sc.close();
	}

}
