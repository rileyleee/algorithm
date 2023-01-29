package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			while (N != 1) {
				if (N % 2 == 0) {
					a++;
					N = N / 2;
				}
				if (N % 3 == 0) {
					b++;
					N = N / 3;
				}
				if (N % 5 == 0) {
					c++;
					N = N / 5;
				}
				if (N % 7 == 0) {
					d++;
					N = N / 7;
				}
				if (N % 11 == 0) {
					e++;
					N = N / 11;
				}
			}
			System.out.println("#" + (i + 1) + " " + a + " " + b + " " + c + " " + d + " " + e);
		}
		sc.close();
	}
}