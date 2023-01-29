package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_2056_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int Arrayday[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 1; i < t + 1; i++) {
			String date = sc.next();

			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6);
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);

			if (m >= 01 && m < 13 && d > 0 && d <= (Arrayday[m - 1])) {
				System.out.println("#" + i + " " + year + "/" + month + "/" + day);
			} else {
				System.out.println("#" + i + " " + "-1");
			}
		}
		sc.close();
	}
}
