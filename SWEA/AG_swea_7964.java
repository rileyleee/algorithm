package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_7964 { // 오류 코드^^..
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

			int sum = 0;
			int cnt = 0;
			for (int a = 0; a < map.length; a += d) {
				System.out.println("전 a: " + a);
				System.out.println("전 a+d: " + (a + d));
				if ((a + d) < map.length) {
					sum = 0;
					System.out.println("sum:" + sum);
					for (int i = a; i <= (a + d); i++) {
						System.out.println("후 a: " + a);
						System.out.println("후 a+d: " + (a + d));
						sum += map[i];
					}
					if (sum < d) {
						if (map[a] == 0) {
							map[a] = 1;
							System.out.println(Arrays.toString(map));
						} else if (map[a] != 0) {
							map[a + d] = 1;
							System.out.println(Arrays.toString(map));
						}
						cnt++;
					}
				}
			}

			for (int i : map) {
				if (d == 1) {
					if (i == 0) {
						cnt++;
					}
				}
			}
			System.out.println("#" + t + " " + cnt);
		}
		sc.close();
	}
}