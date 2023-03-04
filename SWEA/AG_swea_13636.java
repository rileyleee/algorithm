package algorithm.SWEA;

import java.util.Scanner;

public class AG_swea_13636 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {
			int nums = sc.nextInt();
			int[] arr = new int[nums];
			int cnt = 0;
			int max = -1;

			String temp = sc.next();
			for (int n = 0; n < nums; n++) {
				arr[n] = (int) temp.charAt(n) - 48;
			}
			for (int n = 0; n < nums; n++) {
				if (arr[n] == 1) { // 1이면 카운트 올려주고
					cnt++;
				} else { // 0일 때,
					if (max < cnt) { // 기존의 최대 연속치보다 크다면
						max = cnt; // 최대 연속치로 갱신하자.
					}
					cnt = 0; // 그리고 0을 만난 것이니 카운트 초기화
				} // 마지막에 0을 만나지 못해 max값으로 반영되지 않았을 경우를 대비해
			} // 최신 cnt값과 기존의 최대 연속치를 비교해서 큰 값으로 산출
			System.out.println("#" + (t + 1) + " " + Math.max(max, cnt));
		}
		sc.close();
	}
}