package algorithm.SWEA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AG_swea_7102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int t = 0; t < test; t++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] sum = new int[n * m];
			int[] cnt = new int[n + m + 1]; // 인덱스 0 포함

			int s = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					sum[s] = i + j;
					cnt[sum[s]]++;
					s++;
				}
			}

			int freq = -1;
			for (int c = 0; c < cnt.length; c++) {
				if (cnt[c] >= freq) {
					freq = cnt[c];
				}
			}

			Queue<Integer> qu = new LinkedList<>();
			for (int c = 0; c < cnt.length; c++) {
				if (cnt[c] == freq) {
					qu.offer(c);
				}
			}

//			System.out.print("#" + (t + 1) + " ");
//			// Queue 출력하기
//			Iterator ite = qu.iterator();
//			while (ite.hasNext()) {
//				System.out.print(ite.next() + " ");
//			}
			System.out.println("#" + (t + 1) + " " + qu.toString().replaceAll("[\\[\\],]", ""));
		}
		sc.close();
	}
}