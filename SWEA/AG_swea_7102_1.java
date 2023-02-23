package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_7102_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			System.out.print("#" + i);
			if (N > M) {
				for (int j = M + 1; j <= N + 1; j++) {
					System.out.print(" " + j);
				}
			} else if (N < M) {
				for (int j = N + 1; j <= M + 1; j++) {
					System.out.print(" " + j);
				}
			} else {
				System.out.print(" " + (N + 1));
			}
			System.out.println();
		}
	}
}
// 값이 더해지는 규칙성을 보면 둘 중 작은 값 +1부터 큰 값 +1까지 
// 최대값이면서 동일한 빈도를 가지고 있다는 것을 확인할 수 있음