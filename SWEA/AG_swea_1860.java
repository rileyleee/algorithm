package algorithm.SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class AG_swea_1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int t = 0; t < test; t++) {

			int pNum = sc.nextInt();
			int sec = sc.nextInt();
			int fish = sc.nextInt();

			// 시기별 만들어지는 붕어빵 수
			int[] sumArr = new int[11112];
			int d = 1;

			while (sec * d < sumArr.length) {
				sumArr[sec * d] = fish;
				d++;
			}

			// 누적합 배열
			int[] addArr = new int[sumArr.length];

			addArr[0] = sumArr[0];
			for (int a = 1; a < addArr.length; a++) {
				addArr[a] = sumArr[a] + addArr[a - 1];
			}

			System.out.println(Arrays.toString(addArr));
			boolean flag = true;
			for (int p = 0; p < pNum; p++) {
				int pSec = sc.nextInt();
				System.out.println(addArr[pSec]);
				if (addArr[pSec] >= 1) {
					for (int a = pSec; a < addArr.length; a++) {
						addArr[a]--;
					}
				} else if (addArr[pSec] < 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("#" + (t + 1) + " " + "Possible");
			} else {
				System.out.println("#" + (t + 1) + " " + "Impossible");
			}
		}
		sc.close();
	}
}
