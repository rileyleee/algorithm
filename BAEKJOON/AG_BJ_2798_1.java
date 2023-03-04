package algorithm.BAEKJOON;

import java.util.Scanner; //틀린답안
// 순서만 다르고 같은 숫자의 조합을 뽑는 방법임 
// 123 132 -> 순서로는 유의미하나 조합으로는 무의미
// 중복은 된다한들 최대값 산출에는 오류가 없어야 하는데 왜 틀릴까

public class AG_BJ_2798_1 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cNum = sc.nextInt();
		int target = sc.nextInt();

		int[] cArr = new int[cNum];

		for (int c = 0; c < cNum; c++) {
			cArr[c] = sc.nextInt();
		}
		int bj = 0;	int i = -1;	int j = -1;	int k = -1;	int max = 0;

		for (int c = 0; c < cNum; c++) {
			i = cArr[c];
			for (int d = 0; d < cNum; d++) { 
				if (cArr[d] != i) {
					j = cArr[d];
				}
				for (int e = 0; e < cNum; e++) {
					if (cArr[e] != i && cArr[e] != j) {
						k = cArr[e];
					}
					if ((i + j + k) <= target) {
						bj = i + j + k;
						if (bj > max) {
							max = bj;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}