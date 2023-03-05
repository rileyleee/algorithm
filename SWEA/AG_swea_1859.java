package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1859 {  //직전 값이랑만 비교...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 1; t <= test; t++) {

			int n = sc.nextInt();
			int[] price = new int[n];
			int[] diff = new int[n - 1];
			int max = Integer.MIN_VALUE;
			for (int p = 0; p < n; p++) {
				price[p] = sc.nextInt();
				max = Math.max(max, price[p]);
			}

			for (int p = 0; p < n - 1; p++) {
				diff[p] = price[p + 1] - price[p];
			}
			System.out.println(Arrays.toString(diff));

			int[] cnt = new int[max + 1]; 

			long profit = 0;

			for (int p = 0; p < n - 1; p++) {
				if (diff[p] >= 0) { // 뒤 값이 더 클 때
					cnt[price[p]]++; // 카운팅배열의 가격과 같은 인덱스에 값을 더해줌
					System.out.println(Arrays.toString(cnt));
					if (p == n - 2) { // 차이 값이 양수이고 차이 배열의 마지막 인덱스라면
						for (int c = 1; c < cnt.length; c++) {
							if (cnt[c] != 0) { // 카운팅 배열 돌면서
								profit += (price[n - 1] - c) * cnt[c]; // 마지막 가격에서 산 가격을 빼주고 그 크기 만큼 곱해서 이익 처리
								System.out.println(Arrays.toString(cnt));
							}
							cnt[c] = 0; // 매도 했으니 초기화
							System.out.println(Arrays.toString(cnt));
						}
					}
				} else if (diff[p] < 0) { // 뒤 값이 더 작을 때
					for (int c = 1; c < cnt.length; c++) {
						if (cnt[c] != 0) { // 카운팅 배열에서 값이 있는 곳이 있다면
							profit += (price[p] - c) * cnt[c]; // 현재 가격에서 기존에 산 가격 빼주고 그 크기 만큼 곱해서 이익을 처리
							System.out.println(Arrays.toString(cnt));
						}
						cnt[c] = 0; // 다시 매도했으니 초기화
						System.out.println(Arrays.toString(cnt));
					}
				}
			}
			System.out.println("#" + t + " " + profit);
		}
		sc.close();
	}

}
