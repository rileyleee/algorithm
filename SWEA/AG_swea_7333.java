package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_7333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {

			int bNum = sc.nextInt();
			int[] bW = new int[bNum];

			int sum = 0;
			int max = 0;
			int bcnt = 0;
			int cnt = 0;
			int reBox = 0;
			int remaining = 0;

			for (int b = 0; b < bNum; b++) {

				bW[b] = sc.nextInt();
				sum += bW[b];

				if (bW[b] >= 50) {
					bcnt++;
				}

				if (bW[b] >= 25) {
					cnt++;
				}

				if (bW[b] > max) {
					max = bW[b];
				}

			}

			remaining = sum - bcnt * 50;
			reBox = bNum - bcnt;

		}

		sc.close();
	}

}
