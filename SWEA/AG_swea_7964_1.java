package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_7964_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int d = sc.nextInt();

			int[] map = new int[n + 2];

			map[0] = 1;
			map[n + 1] = 1;

			for (int a = 1; a < n + 1; a++) {
				map[a] = sc.nextInt();
			}
			System.out.println(Arrays.toString(map));

			int cnt = 0;
			int zCnt = 0;

			for (int m = 0; m < map.length; m++) {
				if (map[m] == 0) {
					zCnt++;
					System.out.println("제로 증가" + zCnt);
				} else if (map[m] == 1) {
					zCnt = 0;
					System.out.println("제로 초기화" + zCnt);
				}
				if (zCnt == d) {
					cnt++;
					System.out.println("문 필요해" + cnt);
					zCnt = 0;
				}

			}
			System.out.println("#" + t + " " + cnt);
		}
		sc.close();
	}
}