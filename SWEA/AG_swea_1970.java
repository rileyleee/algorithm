package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {
			int n = sc.nextInt();
			int[] moneyArr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
			int[] mcntArr = new int[8];
			int minus = n;

			outer: for (int i = 0; i < moneyArr.length; i++) {
				int cnt = 0;
				if (moneyArr[i] <= minus) {
					while (moneyArr[i] <= minus) {
						minus -= moneyArr[i];
						cnt++;
						mcntArr[i] = cnt;
					}
				} else {
					continue outer;
				}
			}
			System.out.println("#" + (test + 1));
			for (int i = 0; i < mcntArr.length; i++) {
				System.out.print(mcntArr[i] + " ");				
			}
			System.out.println();
		}
		sc.close();
	}
}