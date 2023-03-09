package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_4789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			// 문자열로 받아서
			String claps = sc.next();
			int l = claps.length();

			// 정수 배열로 바꾸기
			int[] clap = new int[l];
			for (int c = 0; c < l; c++) {
				clap[c] = claps.charAt(c) - 48;
			}

			// 누적합 배열 만들기
			int[] sumClaps = new int[l];
			sumClaps[0] = clap[0];
			for (int s = 1; s < l; s++) {
				sumClaps[s] = clap[s] + sumClaps[s - 1];
			}
			System.out.println(Arrays.toString(clap));
			System.out.println(Arrays.toString(sumClaps));
			int cnt = 0;
			int add = 0;
			for (int c = 1; c < l; c++) {
				add = 0;
				if (clap[c] >= 1) {
					if (sumClaps[c - 1] < c) {
						add = c - sumClaps[c - 1];
						cnt += add;
						System.out.println(cnt);
						for (int i = c - 1; i < l; i++) {
							System.out.println("i: " + i);
							sumClaps[i] += add;
							System.out.println(Arrays.toString(sumClaps));

						}
					}
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
		sc.close();
	}
}
