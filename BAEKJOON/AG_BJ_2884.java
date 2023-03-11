package algorithm.BAEKJOON;

import java.util.Scanner;

public class AG_BJ_2884 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m < 45) {
			h--;
			m = m - 45 + 60;
		} else {
			m = m - 45;
		}

		if (h < 0) {
			h = 23;
		}

		System.out.println(h + " " + m);
		sc.close();
	}
}