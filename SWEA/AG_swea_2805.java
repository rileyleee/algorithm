package algorithm.SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AG_swea_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		for (int t = 0; t < test; t++) {
			int N = Integer.parseInt(br.readLine());

			// int[][] arr = new int[N][N];
			// 배열을 굳이 만들지 않아도 가능

			int mid = N / 2;
			int sum = 0;
			for (int r = 0; r < N; r++) {
				String str = br.readLine();
				for (int c = 0; c < N; c++) {
					char temp = str.charAt(c);

					// 이 조건에 해당된다면!
					// 델타배열을 다시 생각해보자!
					// 절댓값을 사용하는 것은 실제 칸의 이동 횟수를 알아내려고.
					// 중간값 보다 작거나 같으면 마름모 영역이된다.
					if (Math.abs(mid - r) + Math.abs(mid - c) <= mid) {
						sum += (temp - '0');
					}
				}
			}
			System.out.println("#" + (t + 1) + " " + sum);
		}
	}
}
