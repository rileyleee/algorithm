package algorithm.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class AG_BJ_4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int[] tri = new int[3];

			for (int i = 0; i < tri.length; i++) {
				tri[i] = sc.nextInt();
			}
			Arrays.sort(tri);
			int sum = 0;
			for (int i = 0; i < tri.length; i++) {
				sum += tri[i];
			}
			if (sum == 0) {
				break;
			}
			if (tri[2] * tri[2] == tri[1] * tri[1] + tri[0] * tri[0]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}