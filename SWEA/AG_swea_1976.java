package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1976 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();

			int tempH = h1 + h2;
			int tempM = m1 + m2;
			int H = 0;
			int M = 0;

			if (tempH < 12) {
				if (tempM <= 59) {
					H = tempH;
					M = tempM;
				} else {
					H = tempH + 1;
					M = tempM - 60;
				}
			} else if (tempH == 12) {
				if (tempM <= 59) {
					H = tempH;
					M = tempM;
				} else {
					H = tempH - 11;
					M = tempM - 60;
				}
			} else {
				if (tempM <= 59) {
					H = tempH - 12;
					M = tempM;
				} else {
					H = tempH - 11;
					M = tempM - 60;
				}
			}
			System.out.println("#" + (i + 1) + " " + H + " " + M);
		}
		sc.close();
	}
}
