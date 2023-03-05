package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1859_1 { // 어려우면 역방향으로 해보기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			short[] price = new short[n];
			int max = Integer.MIN_VALUE;
			int maxIdx = -1;
			for (int p = 0; p < n; p++) {
				price[p] = sc.nextShort();

				if (max < price[p]) {
					max = price[p];
					maxIdx = p;
				}
			}

			short[] cnt = new short[max + 1];
			long profit = 0;
			int startIdx = 0;
			while (true) {

				for (int p = startIdx; p < maxIdx; p++) {
					cnt[price[p]]++; // 카운팅배열의 가격과 같은 인덱스에 값을 더해줌

					for (int c = 1; c < cnt.length; c++) {
						if (cnt[c] != 0) { // 카운팅 배열 돌면서
							profit += (price[maxIdx] - c) * cnt[c]; // 마지막 가격에서 산 가격을 빼주고 그 크기 만큼 곱해서 이익 처리
//								System.out.println(Arrays.toString(cnt));
						}
						cnt[c] = 0; // 매도 했으니 초기화
//							System.out.println(Arrays.toString(cnt));
					}
				}
				startIdx = maxIdx + 1;
				max = Integer.MIN_VALUE;
				for (int p = startIdx; p < n; p++) {
					if (max < price[p]) {
						max = price[p];
						maxIdx = p;
					}
				}

				if (startIdx > n - 1) {
					break;
				}
			}
			System.out.println("#" + t + " " + profit);
		}
		sc.close();
	}
}