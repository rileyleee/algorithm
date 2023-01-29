package algorithm.SWEA;


import java.util.Scanner;

public class AG_swea_1948 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int j = 0; j < t; j++) {
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();

			int[] lastdate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			if (m1 == m2) {
				int sdate = d2 - d1 + 1;
				System.out.println("#" + (j + 1) + " " + sdate);
			} else if (m1 != m2) {
				int tempdate = 0;

				for (int i = (m1 - 1); i <= (m2 - 1); i++) {
					tempdate += lastdate[i];
				}
				int ddate = tempdate - d1 - (lastdate[m2 - 1] - d2) + 1;
				System.out.println("#" + (j + 1) + " " + ddate);
			}
		}
		sc.close();
	}
}