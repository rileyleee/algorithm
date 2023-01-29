package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2070_1 {
	public static void main(String[] args) {
		// 배열 사용하지 않는 방법
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i < T + 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > b) {
				System.out.println("#" + i + " " + ">");
			} else if (a < b) {
				System.out.println("#" + i + " " + "<");
			} else {
				System.out.println("#" + i + " " + "=");
			}
		}
		sc.close();
	}
}
